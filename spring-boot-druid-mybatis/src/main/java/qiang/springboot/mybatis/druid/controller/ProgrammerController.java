package qiang.springboot.mybatis.druid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import qiang.springboot.mybatis.druid.bean.Programmer;
import qiang.springboot.mybatis.druid.dao.ProgrammerDao;

import java.util.List;

/**
 * @author Qiang.wei
 * @date 2019/8/2 15:15
 * @Description
 */
@RestController
public class ProgrammerController {

    @Autowired
    private ProgrammerDao programmerDao;

    @GetMapping("/programmers")
    public List<Programmer> get() {
        return programmerDao.selectAll();
    }
}