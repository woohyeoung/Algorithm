package mathematics.july1w;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class Q1008 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] ary = br.readLine().split(" ");
    System.out.println(new BigDecimal(ary[0]).divide(new BigDecimal(ary[1]), MathContext.DECIMAL128));
  }
}
