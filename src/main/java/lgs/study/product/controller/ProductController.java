package lgs.study.product.controller;

import lgs.study.product.dto.ProductDto;
import lgs.study.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/{prdId}")
    public ProductDto getPrdId(@PathVariable String prdId){
        ProductDto productDto = productService.getProduct(prdId);
        return productDto;
    }
}
