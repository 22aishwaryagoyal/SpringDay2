package com.fis.demoproject.util;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityClass {
	
	@Before("execution(public void com.fis.demoproject.service.ClientService.*())")
	public void doSecurity()
	{
		System.out.println(" Security code executes");
	}

}
