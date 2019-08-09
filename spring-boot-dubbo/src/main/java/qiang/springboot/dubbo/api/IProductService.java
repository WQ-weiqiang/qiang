package qiang.springboot.dubbo.api;

import qiang.springboot.dubbo.bean.Product;

import java.util.List;

/**
 * @author Qiang.wei
 * @date 2019/8/5 9:30
 * @Description 产品服务接口
 */
public interface IProductService {

    Product queryProductById(int id);
    List<Product> queryAllProduct();
}
