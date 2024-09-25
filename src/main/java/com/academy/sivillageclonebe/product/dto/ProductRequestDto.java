package com.academy.sivillageclonebe.product.dto;

import com.academy.sivillageclonebe.product.entity.Product;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {

    private String productUuid;
    private String productCode;
    private Integer brandId;
    private String productName;
    private Long price;
    private String productDescription;
    private String productDetailContent;

    public Product toEntity(String productUuid, String productCode) {
        return Product.builder()
                .productUuid(productUuid)
                .productCode(productCode)
                .brandId(brandId)
                .productName(productName)
                .price(price)
                .productDescription(productDescription)
                .productDetailContent(productDetailContent)
                .build();
    }
}
