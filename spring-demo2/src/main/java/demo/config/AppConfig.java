package demo.config;


import demo.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//
@Configuration
public class AppConfig {
    @Bean
    public TestService testService() {
        return new TestService();
    }
}