package com.fastcompus.springpractice.service;

import com.fastcompus.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Component랑 하는 일이 똑같지만 Spring에게 Service 역할을 한다고 인식시키는 거임.
public class SortService {

    private final Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort) { // @Qualifier : 파일 이름 매칭
        this.sort = sort;
        System.out.println("[구현체] : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
