package qiang.springboot.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import qiang.springboot.mybatis.bean.Programmer;

import java.util.List;

/**
 * @author Qiang.wei
 * @date 2019/8/2 10:38
 * @Description
 */
@Mapper
public interface ProgrammerMapper {
    void save(Programmer programmer);

    Programmer selectById(int id);

    List<Programmer> selectAll();

    int modify(Programmer programmer);

    void delete(int id);

}
