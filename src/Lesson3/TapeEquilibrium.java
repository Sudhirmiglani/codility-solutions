package Lesson3;

public class TapeEquilibrium {

    public static int solution(int[] A) {

        if (A.length <= 1) {
            return 0;
        }

        int leftSum = A[0];
        int rightSum = 0;
        for (int i = 1; i < A.length; i++) {
            rightSum += A[i];
        }

        int sum = Math.abs(rightSum - leftSum);

        for (int i = 1; i < A.length - 1; i++) {
            int ele = A[i];
            leftSum += ele;
            rightSum -= ele;
            sum = Math.min(sum, Math.abs(rightSum - leftSum));
        }

        return sum;

    }

    public static void main(String ap[]) {

        int arr[] = {-1000, 1000};
        System.out.println(solution(arr));

        int arr1[] = {3, 1, 2, 4, 3};
        System.out.println(solution(arr1));

    }

}
