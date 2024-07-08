package com.ohgiraffers.common;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private String name;    // 상품명
    private int price;      // 상품가격
}
