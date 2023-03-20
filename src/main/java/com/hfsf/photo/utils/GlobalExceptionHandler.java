package com.hfsf.photo.utils;


import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = MngBizException.class)
    @ResponseBody
    public JsonResult bizExceptionHandler(HttpServletRequest req, MngBizException e) {
        logger.error("发生业务异常！原因是：{}", e.getErrorMsg());
        if (StringUtils.isNotBlank(e.getErrorCode())) {
        	return new JsonResultWithData<String>(e.getErrorCode(), e.getErrorMsg());
        }
        return new JsonResultWithData<String>(e.getErrorMsg());
    }


    /**
     * 处理其他异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResult otherExceptionHandler(HttpServletRequest req, Exception e) {
        logger.error("未知异常！原因是:", e);
        return new JsonResultWithData<String>("系统异常，请联系管理员");
    }
}
