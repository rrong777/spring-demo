package demo;

import demo.config.AppConfig;
import demo.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        TestService testService = context.getBean("testService", TestService.class);
        testService.testMethod();
        testService.test222();
        System.out.println();
    }
}
