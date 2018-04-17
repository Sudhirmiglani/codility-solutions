package Lesson92;

import java.util.HashSet;
import java.util.Set;

public class SocksLaundering {


    public int solution(int K, int[] C, int[] D) {
        // write your code in Java SE 8

        Set<Integer> cleanSet = new HashSet<>();
        Set<Integer> dirtySet = new HashSet<>();

        int count = 0;

        for (int i = 0; i < C.length; i++) {

            int ele = C[i];
            if (cleanSet.contains(ele)) {
                count++;
                cleanSet.remove(ele);
            } else {
                cleanSet.add(ele);
            }
        }

        for (int i = 0; i < D.length && K > 0; i++) {

            int ele = D[i];
            if (cleanSet.contains(ele)) {
                count++;
                K--;
                cleanSet.remove(ele);
            } else if (dirtySet.contains(ele) && K > 1) {
                count++;
                K -= 2;
                dirtySet.remove(ele);
            } else {
                cleanSet.add(ele);
            }
        }

        return count;

    }
}
