package lgs.study.product.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity{
    @Id
    private String prdId;
    private String prdName;
    private int stock;
    private int price;
}
