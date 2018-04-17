package Lesson1;

public class BinaryGap {

    public int solution(int N) {

        String str = Integer.toBinaryString(N);

        boolean isGapStarted = false;
        int maxCount = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '1') {

                if (isGapStarted) {
                    maxCount = Math.max(maxCount, count);

                } else {
                    isGapStarted = true;
                }
                count = 0;

            } else {
                if (isGapStarted) {
                    count++;
                }
            }

        }
        return maxCount;
    }

}
