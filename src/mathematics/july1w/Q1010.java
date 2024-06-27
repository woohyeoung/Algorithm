package mathematics.july1w;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q1010 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    StringTokenizer st = null;
    for (int i = 0; i < t; i++) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      if (n == m)
        sb.append(1).append("\n");
      else {
        BigInteger c = BigInteger.ONE;
        BigInteger r = BigInteger.ONE;
        for (int j = 1; j <= m; j++) {
          c = c.multiply(new BigInteger(String.valueOf(j)));
        }
        for (int j = 1; j <= n; j++) {
          r = r.multiply(new BigInteger(String.valueOf(j)));
        }
        for (int j = 1; j <= m-n; j++) {
          r = r.multiply(new BigInteger(String.valueOf(j)));
        }
        sb.append(c.divide(r)).append("\n");
      }
    }
    System.out.print(sb);
  }
}
