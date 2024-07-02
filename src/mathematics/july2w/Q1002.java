package mathematics.july2w;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      sb.append(solve(
          Integer.parseInt(st.nextToken()),
          Integer.parseInt(st.nextToken()),
          Integer.parseInt(st.nextToken()),
          Integer.parseInt(st.nextToken()),
          Integer.parseInt(st.nextToken()),
          Integer.parseInt(st.nextToken())
      )).append('\n');
    }
    System.out.print(sb);
  }
  static int solve(int x1, int y1, int r1, int x2, int y2, int r2) {
    int d = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    if (x1 == x2 && y1 == y2 && r1 == r2)
      return -1;
    else if (d > Math.pow(r1 + r2, 2) || d < Math.pow(r2 - r1, 2))
      return 0;
    else if (d == Math.pow(r1 + r2, 2) || d == Math.pow(r2 - r1, 2))
      return 1;
    else
      return 2;
  }
}
