package mathematics.july2w;

import java.io.*;
import java.util.ArrayList;

public class Q1541 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = br.readLine().split("");
    ArrayList<Integer> ary = new ArrayList<>();
    ArrayList<Integer> iList = new ArrayList<>();
    ArrayList<String> sList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (String s : arr) {
      if ("+".equals(s) || "-".equals(s)) {
        iList.add(Integer.parseInt(sb.toString()));
        sb.setLength(0);
        sList.add(s);
      } else
        sb.append(s);
    }
    iList.add(Integer.parseInt(sb.toString()));
    int ans = iList.get(0);
    for (int i = 0; i < sList.size(); i++) {
      if ("+".equals(sList.get(i)))
        ans += iList.get(i + 1);
      else {
        ary.add(ans);
        ans = iList.get(i + 1);
      }
    }
    ary.add(ans);
    ans = ary.get(0);
    if (ary.size() > 1)
      for (int i = 1; i < ary.size(); i++)
        ans -= ary.get(i);
    System.out.print(ans);
    br.close();
  }
}
