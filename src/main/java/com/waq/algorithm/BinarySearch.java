package com.waq.algorithm;

import java.util.Arrays;

/**
 * 二分查找算法
 * 用于已经排好序的数组
 */

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int[] test = new int[]{9, 0, 2, 5, 3};
        int i = binarySearch.binarySearch(test, 0);
        System.out.println(i);

    }

    public int binarySearch(int[] array, int data) {

        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        int middle;

        while (left <= right) {

            // 防止溢出
            middle = left + (right - left) / 2;
            if (array[middle] == data) {
                return middle;
            }
            if (array[middle] > data) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }

        return -1;

    }

}
