package com.waq.sort;

import java.util.Arrays;

/**
 * 选择排序
 */

public class SelectSort {

    public static void main(String[] args) {

        int[] test = new int[]{9, 0, 2, 5, 3};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(test);

    }

    public void selectSort(int[] select) {

        for (int i = 0; i < select.length - 1; i++) {

            int min = i;
            int temp;

            for (int j = i + 1; j < select.length; j++) {

                if (select[min] > select[j]) {
                    min = j;
                }

            }

            temp = select[min];
            select[min] = select[i];
            select[i] = temp;

        }

        System.out.println(Arrays.toString(select));

    }

}
