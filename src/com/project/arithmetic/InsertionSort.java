package com.project.arithmetic;

/**
 * 插入排序(Insertion Sort)
 */
public class InsertionSort {

    public void insert_sort(int[] array, int length) {
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {  // 后一个数小于前一个数才交换位置
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                } else {         //不需要交换
                    break;
                }
            }
        }

        getList(array);

    }

    private void getList(int[] array) {
        System.out.print("插入排序输出结果 = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
