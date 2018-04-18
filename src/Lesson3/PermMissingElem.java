package Lesson3;

public class PermMissingElem {

    public static int solution(int[] A) {

        if (A.length == 0){
            return 1;
        }

        int sumofArray = A[0];
        int sumOfElements = 1;

        for (int i = 1; i < A.length; i++)
            sumofArray = sumofArray ^ A[i];

        for (int i = 2; i <= A.length + 1; i++)
            sumOfElements = sumOfElements ^ i;

        return (sumofArray ^ sumOfElements);

    }
}
