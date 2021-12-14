package com.fastcompus.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        //given ( Mocking이라던가, Test에 활용될 지역 변수를 만듦 )
        String[] args = {"3", "1", "2"};

        //when & Then
        Main.main(args);
    }
}