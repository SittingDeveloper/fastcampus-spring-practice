package com.fastcompus.javaoop.service;

import com.fastcompus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void test() {
        //given ( Mocking이라던가, Test에 활용될 지역 변수를 만듦 )

        //when ( 테스트하고자 하는 동작과 그 동작으로 인해 만들어지는 결과값을 받아오는 것 )
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        //then ( 예상한 동작대로 동작하는지 검증하는 것 )
        assertEquals(List.of("1", "2", "3"), actual);
    }
}