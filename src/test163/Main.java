package test163;
// 백준/실버3/11727 2×n 타일링 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= N; i++) {
            dp[i] = ((dp[i - 1] + 2 * dp[i - 2])) % 10_007;
        }

        System.out.println(dp[N]);
    }
}