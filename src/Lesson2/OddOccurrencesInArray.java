package Lesson2;

public class OddOccurrencesInArray {

    public static int solution(int A[]) {

        int uniqueElement = 0;
        for (int i = 0; i < A.length; i++) {
            uniqueElement = uniqueElement ^ A[i];
        }
        return uniqueElement;

    }

}
