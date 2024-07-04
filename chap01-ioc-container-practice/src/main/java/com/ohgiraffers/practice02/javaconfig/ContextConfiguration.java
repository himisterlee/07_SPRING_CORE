package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public BoardDTO getBoard() {
        System.out.println("getBoard 메소드 호출함...");
        return new BoardDTO(2L, "스프링 수업이 앞으로 많이 어려워질까요?", "그래도 포기하지 않고 열심히 해볼거에요!", "미래의멋진개발자");
    }
}
