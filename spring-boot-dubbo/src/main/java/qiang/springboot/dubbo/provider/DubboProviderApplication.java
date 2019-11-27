package qiang.springboot.dubbo.provider;

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
@ComponentScan(basePackages = {"qiang.springboot.dubbo.provider", "qiang.springboot.dubbo.common"})
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class);
    }
}
