package qiang.springboot.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Qiang.wei
 * @date 2019/8/5 11:09
 * @Description
 */
@SpringBootApplication
@EnableDubbo
@ComponentScan(basePackages = {"qiang.springboot.dubbo.consumer", "qiang.springboot.dubbo.common"})
public class DubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class);
    }
}
