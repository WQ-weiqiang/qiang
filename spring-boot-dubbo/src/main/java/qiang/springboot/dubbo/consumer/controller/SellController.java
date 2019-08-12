package qiang.springboot.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import qiang.springboot.dubbo.common.api.IProductService;
import qiang.springboot.dubbo.common.bean.Product;

import java.util.List;

/**
 * @author Qiang.wei
 * @date 2019/8/12 9:33
 * @Description
 */

@Controller
@RequestMapping("sell")
public class SellController {
    @Reference
    private IProductService productService;

    @RequestMapping
    public String productList(Model model) {
        List<Product> products = productService.queryAllProducts();
        model.addAttribute("products", products);
        return "products";

    }

    @RequestMapping("product/{id}")
    public String productDetail(@PathVariable int id, Model model) {
        Product product = productService.queryProductById(id);
        model.addAttribute("product", product);
        return "product";
    }

}
