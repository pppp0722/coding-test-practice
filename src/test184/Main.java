package test184;
// 백준/실버2/15988 1, 2, 3 더하기 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int MOD = 1_000_000_009;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            long[] dp = new long[n + 1];
            dp[1] = 1;
            if (n >= 2) {
                dp[2] = 2;
            }
            if (n >= 3) {
                dp[3] = 4;
            }

            for (int j = 4; j <= n; j++) {
                dp[j] = (dp[j - 1] + dp[j - 2] + dp[j - 3]) % MOD;
            }

            System.out.println(dp[n]);
        }
    }
}
