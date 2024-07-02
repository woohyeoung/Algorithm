package mathematics.july2w;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1026 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int ans = 0;
    Integer[] a = new Integer[n];
    Integer[] b = new Integer[n];
    st = new StringTokenizer(br.readLine());
    for (int j = 0; j < n; j++) {
      a[j] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(a);
    st = new StringTokenizer(br.readLine());
    for (int j = 0; j < n; j++) {
      b[j] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(b, Collections.reverseOrder());
    for (int i = 0; i < n; i++) {
      ans += a[i] * b[i];
    }
    System.out.print(ans);
  }
}
