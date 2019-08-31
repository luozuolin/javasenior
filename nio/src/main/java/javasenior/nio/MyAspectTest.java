package javasenior.nio;

import org.springframework.stereotype.Component;

@Component
public class MyAspectTest {

    @MyAnnotation
    public   void myTest(){
        System.out.println("mytest方法。");
    }
}
