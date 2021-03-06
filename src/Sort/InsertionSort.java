package Sort;

/**
 * @author jc
 * @date 2021/1/27
 */
public class InsertionSort {
    public static void main(String[] args) {

    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
        int j;
        for (int i = 1; i < a.length; i++) {
            T tmp = a[i];
            for (j = i; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
    }
}
