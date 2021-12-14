package com.fastcompus.springpractice;

import com.fastcompus.springpractice.config.Config;
import com.fastcompus.springpractice.logic.BubbleSort;
import com.fastcompus.springpractice.logic.JavaSort;
import com.fastcompus.springpractice.logic.Sort;
import com.fastcompus.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // Sort<String> sort = new JavaSort<>(); //

        // new 없이 SpringContext에서 Bean을 꺼내옴
        // Sort<String> sort = context.getBean(Sort.class); // 정공법
        SortService sortService = context.getBean(SortService.class);


        System.out.println("[result] : " + sortService.doSort(Arrays.asList(args)));
    }
}
