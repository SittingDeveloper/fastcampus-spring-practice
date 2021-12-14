package com.fastcompus.springpractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.fastcompus.springpractice") // 여기를 기준으로 이 이하의 모든 SpringBean들을 Scan하겠다는 의미.
@Configuration // 스프링 전용 Configuration
public class Config {

}
