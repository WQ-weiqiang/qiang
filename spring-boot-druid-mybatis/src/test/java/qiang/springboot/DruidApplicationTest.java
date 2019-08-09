package qiang.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import qiang.springboot.mybatis.druid.bean.Programmer;
import qiang.springboot.mybatis.druid.dao.ProgrammerDao;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DruidApplicationTest {
    @Autowired
    private ProgrammerDao programmerDao;

    @Test
    public void contextLoads() {
        List<Programmer> programmers = programmerDao.selectAll();
        programmers.forEach(System.out::println);
    }

}
