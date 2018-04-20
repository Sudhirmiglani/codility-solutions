package Lesson4;

public class MissingInteger {

    public static int getMin(int[] A) {

        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            min = Math.min(min, A[i]);
        }
        return min;

    }

    public static int getMax(int[] A) {

        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, A[i]);
        }
        return max;

    }

    public static int solution(int[] A) {

        int min = getMin(A);
        min = Math.max(1, min);
        int max = getMax(A);
        max = Math.max(1, max);

        if (min > 1) {
            return 1;
        }

        boolean arr[] = new boolean[max - min + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                arr[A[i] - min] = true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                return i + min;
            }
        }
        return max + 1;
    }

}
