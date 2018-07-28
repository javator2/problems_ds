package com.sda.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problems {

    public static String last(List<String> asList) {
        return asList.get(asList.size() - 1);
    }

    public static Integer secondLast(List<Integer> numbers) {
        return numbers.get(numbers.size() - 2);
    }

    public static int length(List<Object> emptyList) {
        return emptyList.size();
    }

    public static List<Integer> reverse(List<Integer> numbers) {
//        List<Integer> revList = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            revList.add(numbers.get(numbers.size() - i - 1));
//        }
        Collections.reverse(numbers);
        return numbers;
    }

    public static List<String> duplicate(List<String> asList) {
        List<String> dupList = new ArrayList<>(asList);
        for (int i = 0; i < dupList.size(); i+=2) {
            dupList.add(i + 1, dupList.get(i));
        }
        return dupList;
    }
}