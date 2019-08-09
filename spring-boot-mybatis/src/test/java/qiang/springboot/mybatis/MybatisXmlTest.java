package qiang.springboot.mybatis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import qiang.springboot.mybatis.bean.Programmer;
import qiang.springboot.mybatis.dao.ProgrammerMapper;

import java.util.Date;
import java.util.List;

/**
 * @author Qiang.wei
 * @date 2019/8/2 10:54
 * @Description
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisXmlTest {

    @Autowired
    private ProgrammerMapper mapper;

    @Test
    public void save() {
        mapper.save(new Programmer("xiaominng", 12, 3467.34f, new Date()));
        mapper.save(new Programmer("xiaominng", 12, 3467.34f, new Date()));
    }

    @Test
    public void modify() {
        mapper.modify(new Programmer("xiaohong", 112, 347.34f, new Date()));
    }

    @Test
    public void selectByCondition() {
        Programmer programmers = mapper.selectById(1);
        System.out.println(programmers.toString());
    }

    @Test
    public void selectAll() {
        List<Programmer> programmers = mapper.selectAll();
        programmers.forEach(programmer -> {
            System.out.println(programmer.toString());
        });
    }

    @Test
    public void delete() {
        mapper.delete(2);
        Programmer programmers = mapper.selectById(2);
        Assert.assertNull(programmers);
    }
}
