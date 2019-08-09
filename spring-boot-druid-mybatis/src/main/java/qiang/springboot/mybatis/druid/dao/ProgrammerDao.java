package qiang.springboot.mybatis.druid.dao;

import org.apache.ibatis.annotations.*;
import qiang.springboot.mybatis.druid.bean.Programmer;

import java.util.List;

/**
 * @author Qiang.wei
 * @date 2019/8/2 15:16
 * @Description
 */

@Mapper
public interface ProgrammerDao {


    @Select("select * from programmer")
    List<Programmer> selectAll();

    @Insert("insert into programmer (name, age, salary, birthday) VALUES (#{name}, #{age}, #{salary}, #{birthday})")
    void save(Programmer programmer);

    @Select("select * from programmer where name = #{id}")
    Programmer selectById(int id);

    @Update("update programmer set name=#{name},age=#{age},salary=#{salary},birthday=#{birthday} where id=#{id}")
    int modify(Programmer programmer);

    @Delete(" delete from programmer where id = #{id}")
    void delete(int id);
}
