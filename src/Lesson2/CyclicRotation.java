package Lesson2;

public class CyclicRotation {

    public static int[] solution(int K, int[] A) {
        // write your code in Java SE 8

        if (A.length == 0) {
            return A;
        }

        K = K % A.length;
        int i = 0;
        while (i < K) {
            int temp = A[A.length - 1];
            for (int j = A.length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = temp;
            i++;
        }
        return A;


    }
}
