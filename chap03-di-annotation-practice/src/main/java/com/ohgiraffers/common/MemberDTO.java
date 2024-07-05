package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Primary;

@AllArgsConstructor
@ToString
public class MemberDTO {

    private Long id;
    private String name;
}
