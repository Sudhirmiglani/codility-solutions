package Lesson3;

public class FrogJmp {

    public int solution(int X, int Y, int D) {

        int diff = Y - X;
        return (diff / D) + ((diff % D == 0) ? 0 : 1);

    }
}
