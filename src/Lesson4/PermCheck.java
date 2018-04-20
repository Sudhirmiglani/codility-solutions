package Lesson4;

public class PermCheck {

    public int solution(int[] A){

        if (A.length == 0){
            return 1;
        }

        boolean arr[] = new boolean[A.length];
        for (int i = 0 ; i < A.length ; i++){

            if(A[i]-1 >= arr.length){
                return 0;
            }
            if (arr[A[i]-1]){
                return 0;
            }
            arr[A[i]-1] = true;
        }

        for (int i = 0 ; i < arr.length ; i++){
            if (!arr[i]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String ap[]){

    }
}
