package mathematics.july1w;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1000 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int ans = 0;
    for (String s : str) {
      ans += Integer.parseInt(s);
    }
    System.out.println(ans);
  }
}