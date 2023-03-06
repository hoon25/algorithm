package sort;

import java.util.Arrays;

/*
삽입정렬
- 제자리 정렬(in-place sort)
- 안전 정렬
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 1, 2};
        insertionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void insertionSort(int[] a, int size) {

        for (int i = 1; i < size; i++) {
            // 타겟 넘버
            int target = a[i];

            int j = i - 1;

            // 타겟이 이전 원소보다 크기 전 까지 반복
            while (j >= 0 && target < a[j]) {
                a[j + 1] = a[j]; // 이전 원소를 한칸씩 뒤로 미룬다.
                j--;
            }

            /*
            위 반복문에서 탈출하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
            타겟 원소는 J번째 원소 뒤에 와야한다.
            그러므로 타겟은 j+1 에 위치하게 된다.
             */
            a[j + 1] = target;
        }
    }
}
