package arithmetic;

/**
 * 选择排序
 */
public class SelectionSort {


    public void select_sort(int[] array, int length) {
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;    // 找出最小值对应的下标
                }
            }
            if (minIndex != i) {    // 如果得到minIndex不与默认的下标位置相同，交换元素位置
//                int temp = array[i];
//                array[i] = array[minIndex];
//                array[minIndex] = temp;
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        getList(array);
    }

    private void getList(int[] array) {
        System.out.print("选择排序输出结果 = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
