package qiang.springboot.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import qiang.springboot.dubbo.common.api.IProductService;
import qiang.springboot.dubbo.common.bean.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Qiang.wei
 * @date 2019/8/12 9:52
 * @Description
 */
@Service
public class ProductService implements IProductService {

    private static List<Product> productList = new ArrayList<>();

    static {
        for (int i = 0; i < 20; i++) {
            productList.add(new Product(i, "产品" + i, i / 2 == 0, new Date(), 66.66f * i));
        }
    }

    public Product queryProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


    public List<Product> queryAllProducts() {
        return productList;
    }
}
