package com.training.training.aspect;

import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.springframework.stereotype.Component;  

@Aspect  
@Component 

public class LoginServiceAspect {
	@Before(value = "execution(* com.training.training.service.StudentService.*(..)) and args(studentid, studentmail, studentname)")  
	public void beforeAdvice(JoinPoint joinPoint, Long studentid, String studentmail, String studentname) {  
	System.out.println("Before method:" + joinPoint.getSignature());  
	System.out.println("Creating Student with first name - " + studentid + ", second name - " + studentmail + " and id - " + studentname);  
	}  

}
