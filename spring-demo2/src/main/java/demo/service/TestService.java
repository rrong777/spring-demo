package demo.service;


import org.springframework.beans.factory.annotation.Autowired;

public class TestService {
    @Autowired
    private Test2Service test2Service;
    public void testMethod() {
        System.out.println("基于注解的testMethods");
    }
    public void test222() {
        System.out.println("在test中调用22");
        test2Service.testMethod2();
    }

}
