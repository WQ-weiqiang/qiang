package qiang.web.doman;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Qiang {
    @Value("${qiang.name}")
    private String name;

    @Value("${qiang.age}")
    private String age;

    @Value("${qiang.topic}")
    private String topic;

    @Override
    public String toString() {
        return "Qiang{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
