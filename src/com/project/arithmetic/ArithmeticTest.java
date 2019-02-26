package com.project.arithmetic;

/**
 * 排序算法总结
 * https://www.jianshu.com/p/ae97c3ceea8d
 */
public class ArithmeticTest {

    public static void main(String[] args) {

        // 冒泡排序(BubbleSort)
        System.out.println("**********冒泡排序(BubbleSort)***********");
        int[] arr1 = new int[]{42, 20, 17, 13, 28, 14, 23, 15};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("优化前...");
        bubbleSort.bubbleSort(arr1);
        System.out.println("\n优化后...");
        bubbleSort.bubbleSort1(arr1);   // 优化方案

        // 选择排序(SelectionSort)
        System.out.println("\n**********选择排序(SelectionSort)***********");
        int[] arr2 = new int[]{42, 20, 17, 13, 28, 14, 23, 15};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.select_sort(arr2, arr2.length);

        // 插入排序(Insertion Sort)
        System.out.println("\n**********插入排序(Insertion Sort)***********");
        int[] arr3 = new int[]{42, 20, 17, 13, 28, 14, 23, 15};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insert_sort(arr3, arr3.length);

        // 希尔排序(Shell Sort),   理解起来有点难，貌似面试不会问到
        System.out.println("\n**********希尔排序(Shell Sort)***********");
        int[] arr4 = new int[]{59, 20, 17, 13, 28, 14, 23, 83};
        ShellSort shellSort = new ShellSort();
        shellSort.shell_sort(arr4, arr4.length);

        // 快速排序(Quicksort)
        System.out.println("\n**********快速排序(Quicksort)***********");
        int[] arr5 = new int[]{59, 20, 17, 13, 28, 14, 23, 83};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr5, 1, 2);

    }
}
