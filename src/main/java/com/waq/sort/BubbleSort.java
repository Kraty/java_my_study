package com.waq.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */

public class BubbleSort {

    public static void main(String[] args) {

        int[] test = new int[]{9, 0, 2, 5, 3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(test);

    }

    public void bubbleSort(int[] bubble) {

        for (int i = 0; i < bubble.length - 1; i++) {

            for (int j = 0; j < bubble.length - i - 1; j++) {

                if (bubble[j] > bubble[j + 1]) {

                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;

                }

            }
            
        }

        System.out.println(Arrays.toString(bubble));

    }

}
