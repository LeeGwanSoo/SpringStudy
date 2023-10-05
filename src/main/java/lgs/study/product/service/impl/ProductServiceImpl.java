package lgs.study.product.service.impl;

import lgs.study.product.dto.ProductDto;
import lgs.study.product.entity.ProductEntity;
import lgs.study.product.repository.ProductRepository;
import lgs.study.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public ProductDto getProduct(String prdId) {

        ProductEntity productEntity = productRepository.getById(prdId);
        ProductDto productDto = new ProductDto();
        productDto.setPrdId(productEntity.getPrdId());
        productDto.setPrdName(productEntity.getPrdName());
        productDto.setStock(productEntity.getStock());
        productDto.setPrice(productEntity.getPrice());

        return productDto;
    }
}
