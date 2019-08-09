package qiang.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Qiang.wei
 * @date 2019/8/2 10:39
 * @Description
 */
@SpringBootApplication
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class);
        System.out.println("MybatisApplication start finish ...");
    }
}
