package lgs.study.product.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    private String prdId;
    private String prdName;
    private int stock;
    private int price;

}
