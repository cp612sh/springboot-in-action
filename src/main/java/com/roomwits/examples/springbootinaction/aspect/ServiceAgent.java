package com.roomwits.examples.springbootinaction.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAgent {
    private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.roomwits.examples.springbootinaction.service.*.*(..))")
    public Object arroundInvoke(ProceedingJoinPoint point) throws Throwable {
        logger.info("ServiceAgent.arroundInvoke() before - exectution params: {}",
                Arrays.toString(point.getArgs()));
        Object result = point.proceed();
        logger.info("ServiceAgent.arroundInvoke() after - result: {} ", result);
        return result;
    }
}
