package mathematics.july1w;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1193 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cnt = 1;
    int sum = 0;
    while (true) {
      if (n <= cnt + sum) {
        if (cnt%2 == 1)
          System.out.print((cnt - (n - sum - 1)) + "/" + (n - sum));
        else
          System.out.print((n - sum) + "/" + (cnt - (n - sum - 1)));
        break;
      } else
        sum += cnt++;
    }
  }
}
