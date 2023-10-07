package lgs.study.product.controller;

import lgs.study.product.dto.ProductDto;
import lgs.study.product.entity.ProductEntity;
import lgs.study.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(value = "/product")
    public ProductDto createProduct(ProductDto productDto){

        return productService.saveProduct(productDto);
    }

    @GetMapping(value = "/product/{prdId}")
    public ProductDto getPrdId(@PathVariable String prdId){
        ProductDto productDto = productService.getProduct(prdId);
        return productDto;
    }

    @GetMapping(value = "/product/list")
    public List<ProductDto> getProductList(){
        List<ProductDto> productList = productService.getProductList();
        return productList;
    }
}
