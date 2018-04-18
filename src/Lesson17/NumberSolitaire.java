package Lesson17;

public class NumberSolitaire {

    public int solution(int[] A) {
        int[] dp = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        dp[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            int max = dp[i - 1];
            int j = 1;
            while (j <= 6 && i - j >= 0) {
                max = Math.max(dp[i - j], max);
                j++;
            }
            dp[i] = max + A[i];
        }
        return dp[A.length - 1];
    }

}
