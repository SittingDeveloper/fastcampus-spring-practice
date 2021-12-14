package com.fastcompus.javaoop;

import com.fastcompus.javaoop.logic.BubbleSort;
import com.fastcompus.javaoop.logic.JavaSort;
import com.fastcompus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] : " + sort.sort(Arrays.asList(args)));
    }
}
