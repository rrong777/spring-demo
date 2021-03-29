package demo.main;

import demo.dao.Test1Dao;
import demo.service.impl.TestStoreServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/services.xml");

        Test1Dao test1Dao1 = (Test1Dao) context.getBean("test1Dao");
        // 相当于指定泛型 不用强转
        Test1Dao test1Dao2 = context.getBean("test1Dao", Test1Dao.class);

        TestStoreServiceImpl service = context.getBean("testStore", TestStoreServiceImpl.class);

        System.out.println(service.testMethod());;

    }
}
