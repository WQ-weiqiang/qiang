package qiang.springboot.mybatis.dao;

import org.apache.ibatis.annotations.*;
import qiang.springboot.mybatis.bean.Programmer;

import java.util.List;

@Mapper
public interface ProgrammerDao {

    @Insert("insert into programmer (name, age, salary, birthday) VALUES (#{name}, #{age}, #{salary}, #{birthday})")
    void save(Programmer programmer);

    @Select("select * from programmer where id = #{id}")
    Programmer selectById(int id);

    @Select("select * from programmer ")
    List<Programmer> selectAll();

    @Update("update programmer set name=#{name},age=#{age},salary=#{salary},birthday=#{birthday} where id=#{id}")
    int modify(Programmer programmer);

    @Delete(" delete from programmer where id = #{id}")
    void delete(int id);
}
