package com.project.arithmetic;

/**
 * 冒泡排序Bubble sort
 */
public class BubbleSort {

    public void bubbleSort(int[] array) {
        int temp;   // 临时变量
        for (int i = 0; i < array.length - 1; i++) {  //表示趟数，一共arr.length-1次
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {   // 是否比较大小
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            System.out.println("循环执行次数 i = " + i);
        }
        getList(array);
    }

    public void bubbleSort1(int[] array) {
        int temp;//临时变量
        boolean flag;//是否交换的标志
        for (int i = 0; i < array.length - 1; i++) {   //表示趟数，一共arr.length-1次。
            flag = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = true;
                }
            }
            System.out.println("循环执行次数 i = " + i);
            if (!flag) break;
        }
        getList(array);
    }

    /**
     * 冒泡排序输出结果 = 13 14 15 17 20 23 28 42
     *
     * @param array
     */
    private void getList(int[] array) {
        System.out.print("冒泡排序输出结果 = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
