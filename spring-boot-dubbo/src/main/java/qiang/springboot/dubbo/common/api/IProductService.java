package qiang.springboot.dubbo.common.api;

import qiang.springboot.dubbo.common.bean.Product;

import java.util.List;

/**
 * @author Qiang.wei
 * @date 2019/8/5 9:30
 * @Description 产品服务接口
 */
public interface IProductService {

    Product queryProductById(int id);

    List<Product> queryAllProducts();
}
