package akhmadwildanlearning.aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {
    
    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {
        Assertions.assertEquals("Hello Wildan", helloService.hello("Wildan"));
        Assertions.assertEquals("Bye Wildan", helloService.bye("Wildan"));
    }
}
