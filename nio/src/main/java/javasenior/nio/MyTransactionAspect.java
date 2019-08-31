package javasenior.nio;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyTransactionAspect {
    @Around("@annotation(MyAnnotation)")
    public   void myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("===开始===");
        pjp.proceed();
        System.out.println("===结束===");
    }
}
