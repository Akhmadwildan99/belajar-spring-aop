package akhmadwildanlearning.aop.service;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HelloService {
    
    public String hello(String name){
        log.info("Call HelloService.hello()");

        return "Hello " + name;
    }

    public String bye(String name){
        log.info("Call HelloService.bye()");

        return "Bye " + name;
    }
}
