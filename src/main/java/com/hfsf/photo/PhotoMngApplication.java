package com.hfsf.photo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@MapperScan({ "com.hfsf.photo.*.dao" })
@ComponentScan(basePackages = { "com.hfsf.photo" })
public class PhotoMngApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoMngApplication.class, args);
	}

}
