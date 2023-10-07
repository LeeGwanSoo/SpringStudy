package lgs.study.product.service;

import lgs.study.product.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto getProduct(String prdId);

    ProductDto saveProduct(ProductDto productDto);

    List<ProductDto> getProductList();
}
