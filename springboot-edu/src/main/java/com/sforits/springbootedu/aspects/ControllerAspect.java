package com.sforits.springbootedu.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/28-16:23 Created by IntelliJ IDEA.
 */
@Aspect
@Configuration
public class ControllerAspect {
    // 环绕通知 当目标方法执行时会先进入环绕通知,然后在环绕通知放行之后,然后执行目标方法,目标方法执行完成之后回到环绕通知
    @Around("within(com.sforits.springbootedu.controller.FirstController)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("进入环绕通知业务处理...");

        //放行业务方法
        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("业务方法执行之后的业务处理.....");
        return null;
    }

/*
    // 前置通知方法  在目标方法执行之前执行
    @Before("within(com.sforits.springbootedu.controller.*Controller)")
    public void before(JoinPoint joinPoint) {
        System.out.println("目标方法名称: " + joinPoint.getSignature().getName());
        System.out.println("目标方法参数: " + joinPoint.getArgs()[0]);
        System.out.println("目标对象: " + joinPoint.getTarget());

        System.out.println("切面: 业务处理...!!!");
    }

    // 后置方法 在目标方法执行之后执行
    @After("within(com.sforits.springbootedu.controller.*Controller)")
    public void after(){
        System.out.println("切面: 后置业务处理...");
    }
*/
}