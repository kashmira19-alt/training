package com.training.training;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.context.annotation.EnableAspectJAutoProxy;  
@SpringBootApplication  
@EnableAspectJAutoProxy(proxyTargetClass=true)  

public class LoginAop {
	
	public static void main(String[] args) {  
		SpringApplication.run(LoginAop.class, args);  
		}  

}
