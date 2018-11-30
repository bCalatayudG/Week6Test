package com.example.user.week6_test.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public Integer[] mergeSort(Integer[] numbers) {
        int size = numbers.length;
        Integer[] l1 = new Integer[numbers.length / 2];
        Integer[] l2 = new Integer[numbers.length / 2];

        if (size == 1) {
            return numbers;
        }
        System.arraycopy(numbers, 0, l1, 0, size / 2);
        System.arraycopy(numbers, (size / 2), l2, 0, size / 2);
        l1 = mergeSort(l1);
        l2 = mergeSort(l2);

        return sort(l1, l2);
    }

    private Integer[] sort(Integer[] l1, Integer[] l2) {
        Integer[] temp = new Integer[0];
        List<Integer> intList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(l1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(l2));

        while (list1.size() != 0 && list2.size() != 0) {
            if (list1.get(0) > list2.get(0)) {
                intList.add(list2.get(0));
                list2.remove(0);
            } else {
                intList.add(list1.get(0));
                list1.remove(0);
            }
        }

        while (list1.size() != 0) {
            intList.add(list1.get(0));
            list1.remove(0);
        }
        while (list2.size() != 0) {
            intList.add(list2.get(0));
            list2.remove(0);
        }
        temp = intList.toArray(temp);
        return temp;
    }
}
