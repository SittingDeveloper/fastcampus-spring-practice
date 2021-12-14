package com.fastcompus.springpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // Bean 으로 인식된다.
public class BubbleSort<T extends Comparable<T>> implements Sort<T>{

    @Override // 구현된 메서드, 꼭 없어도 되지만 그냥 이름만 명시하는 거임
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        for (int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }
        return output;
    }
}