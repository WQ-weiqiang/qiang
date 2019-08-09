package qiang.springboot.dubbo.bean;

import lombok.*;

import java.util.Date;

/**
 * @author Qiang.wei
 * @date 2019/8/5 10:47
 * @Description 产品实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {
    // 产品序列号
    private int id;

    // 产品名称
    private String name;

    // 是否贵重品
    private Boolean isPrecious;

    //生产日期
    private Date dateInProduced;

    //产品价格
    private float price;
}
