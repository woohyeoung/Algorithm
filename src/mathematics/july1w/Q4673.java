package mathematics.july1w;

import java.io.IOException;

public class Q4673 {
  public static void main(String[] args) throws IOException {
    StringBuilder sb = new StringBuilder();
    int[] ary = new int[10001];
    for (int i = 1; i <= 10000; i++) {
      int sum = i;
      char[] s = String.valueOf(i).toCharArray();
      for (int j = 0; j < s.length; j++) {
        sum += Character.getNumericValue(s[j]);
      }
      if (sum <= 10000)
        ary[sum] = 1;
    }
    for (int i = 1; i <= 10000; i++) {
      if (ary[i] == 1) continue;
      sb.append(i).append("\n");
    }
    System.out.println(sb);
  }
}
