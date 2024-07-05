package com.ohgiraffers.common;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class BoardDTO {

    private Long id;
    private String title;
    private String content;
    private MemberDTO writer;

}
