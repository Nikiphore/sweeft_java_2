import java.util.Arrays;

public class Task5 {
    public void runner(){
        int [] array = {6,2,2,3,4,1};
        int k = 8;
        System.out.println("maximum number of elements from " + Arrays.toString(array) +" whose sum is "+ k + " = " + lenOfLongSubarr(array, k));
    }

    public int lenOfLongSubarr(int[] array, int k) {
        int n = array.length;
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (array[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], 1 + dp[i - 1][j - array[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return Math.max(dp[n][k], 0);
    }
}
