package com.example.user.week6_test;

import com.example.user.week6_test.LRU.LRU;
import com.example.user.week6_test.checkparenthesis.CheckParenthesis;
import com.example.user.week6_test.mergesort.MergeSort;
import com.example.user.week6_test.spiralarray.SpiralArray;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--Merge Sort-- ");
        mergeSort();

        System.out.println("\n--Binary Tree-- ");
        binaryTree();

        System.out.println("\n--LRU cache-- ");
        lruCache();

        System.out.println("\n--Spiral Array-- ");
        spiralArray();

        System.out.println("\n\n--Check parenthesis-- ");
        checkParenthesis();

    }


    private static void mergeSort() {
        Integer[] numbers = {14, 33, 27, 10, 35, 19, 42, 9};
        Integer[] result;

        MergeSort mergeSort = new MergeSort();
        result = mergeSort.mergeSort(numbers);
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Sorted Array: " + Arrays.toString(result));
    }

    private static void binaryTree() {
    }

    private static void lruCache() {
        Integer[] numbers = {14, 33, 27, 10, 35, 19, 42, 9};
        Integer size = 3;
        LRU lru = new LRU();
        lru.getLRU(numbers, size);
    }

    private static void spiralArray() {
        Integer[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("Original Array: ");
        for (Integer[] array1 : array) {
            System.out.println(Arrays.toString(array1));
        }
        SpiralArray spiralArray = new SpiralArray();
        System.out.println("\nSpiral Array: ");
        spiralArray.getSpiral(array);

    }

    private static void checkParenthesis() {

        Boolean test;

        String testString1 = "({})[]";
        String testString2 = "[]{]}[";
        CheckParenthesis checkParenthesis = new CheckParenthesis();
        test = checkParenthesis.check(testString1);
        System.out.println("Tested string: " + testString1 + " result: " + test.toString());
        test = checkParenthesis.check(testString2);
        System.out.println("Tested string: " + testString2 + " result: " + test.toString());

    }


}
