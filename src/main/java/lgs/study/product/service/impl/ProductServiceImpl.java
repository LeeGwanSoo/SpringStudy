package lgs.study.product.service.impl;

import lgs.study.product.dto.ProductDto;
import lgs.study.product.entity.ProductEntity;
import lgs.study.product.mapper.ProductMapper;
import lgs.study.product.repository.ProductRepository;
import lgs.study.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;



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

    @Override
    public ProductDto saveProduct(ProductDto productDto) {
        ProductEntity productEntity = new ProductEntity();

        productEntity.setPrdId(productDto.getPrdId());
        productEntity.setPrdName(productDto.getPrdName());
        productEntity.setStock(productDto.getStock());
        productEntity.setPrice(productDto.getPrice());

        productRepository.save(productEntity);

        productDto.setPrdId(productEntity.getPrdId());
        productDto.setPrdName(productEntity.getPrdName());
        productDto.setStock(productEntity.getStock());
        productDto.setPrice(productEntity.getPrice());

        return null;
    }

    @Override
    public List<ProductDto> getProductList() {
        return productMapper.getProductList();
    }

}
