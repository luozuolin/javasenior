package javasenior.nio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AspectTest {
    @Autowired
    MyAspectTest myAspectTest;
    @Test
    public  void myTest(){
        myAspectTest.myTest();
    }
}
