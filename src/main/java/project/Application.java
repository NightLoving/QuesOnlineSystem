package project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("project.dao")
public class Application {
    public static void main(String[] args) {
        System.out.println("Spring程序启动中...");
        SpringApplication.run(Application.class,args);
    }
}
