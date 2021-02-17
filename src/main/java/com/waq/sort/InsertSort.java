package com.waq.sort;

import java.util.Arrays;

/**
 * 插入排序
 */

public class InsertSort {

    public static void main(String[] args) {

        int[] test = new int[]{9, 0, 2, 5, 3};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(test);

    }

    public void insertSort(int[] insert) {

        for (int i = 1; i < insert.length; i++) {

            for (int j = i; j > 0; j--) {

                if (insert[j] < insert[j - 1]) {

                    int temp = insert[j];
                    insert[j] = insert[j - 1];
                    insert[j - 1] = temp;

                }

            }

        }

        System.out.println(Arrays.toString(insert));

    }

}
