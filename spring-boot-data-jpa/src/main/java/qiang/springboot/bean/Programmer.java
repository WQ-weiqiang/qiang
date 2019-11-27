package qiang.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Qiang.wei
 * @date 2019/8/1 13:52
 * @Description
 */

@Entity
@Table(name = "programmer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Programmer {
    /* AUTO:     默认值,主键由程序控制
     * IDENTITY: 数据库自动增长, Oracle不支持这种方式 ORACLE 靠序列来提供类似自增长的功能
     * SEQUENCE: 通过数据库的序列产生主键, MYSQL不支持 MYSQL没有序列的概念
     * Table:    提供特定的数据库产生主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 200)
    private String name;
    private int age;
    @Column(scale = 2)
    private float salary;
    private Date birthday;

    public Programmer(String name, int age, float salary, Date birthday) {

        this.name = name;
        this.age = age;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
