package arithmetic;

/**
 * 希尔排序(Shell Sort)
 */
public class ShellSort {

    public void shell_sort(int[] array, int length) {
        int temp = 0;
        int incre = length;

        while (true) {
            incre = incre / 2;
            for (int k = 0; k < incre; k++) {    //根据增量分为若干子序列
                for (int i = k + incre; i < length; i += incre) {
                    for (int j = i; j > k; j -= incre) {
                        if (array[j] < array[j - incre]) {
                            temp = array[j - incre];
                            array[j - incre] = array[j];
                            array[j] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }

            if (incre == 1) {
                break;
            }
        }

        getList(array);
    }

    private void getList(int[] array) {
        System.out.print("希尔排序输出结果 = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
