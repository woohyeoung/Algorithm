package mathematics.july1w;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1010 {
  // 최초 답안 16820KB, 148ms
//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringBuilder sb = new StringBuilder();
//    int t = Integer.parseInt(br.readLine());
//    StringTokenizer st = null;
//    for (int i = 0; i < t; i++) {
//      st = new StringTokenizer(br.readLine());
//      int n = Integer.parseInt(st.nextToken());
//      int m = Integer.parseInt(st.nextToken());
//      if (n == m)
//        sb.append(1).append("\n");
//      else {
//        BigInteger c = BigInteger.ONE;
//        BigInteger r = BigInteger.ONE;
//        for (int j = 1; j <= m; j++) {
//          c = c.multiply(new BigInteger(String.valueOf(j)));
//        }
//        for (int j = 1; j <= n; j++) {
//          r = r.multiply(new BigInteger(String.valueOf(j)));
//        }
//        for (int j = 1; j <= m-n; j++) {
//          r = r.multiply(new BigInteger(String.valueOf(j)));
//        }
//        sb.append(c.divide(r)).append("\n");
//      }
//    }
//    System.out.print(sb);
//  }
  // 2번째 12916KB, 92ms
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());
    StringTokenizer st;
    for (int i = 0; i < t; i++) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      if (n == m) {
        bw.write(1 + "\n");
      } else {
        bw.write(sol(n, m) + "\n");
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
  static int sol(int n, int m) {
    int[][] dp = new int[m + 1][m + 1];
    for (int i = 0; i <= m; i++) {
      dp[i][0] = 1;
      for (int j = 1; j < i; j++) {
        dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
      }
      dp[i][i] = 1;
    }
    return dp[m][n];
  }

}
