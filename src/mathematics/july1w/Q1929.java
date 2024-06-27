package mathematics.july1w;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * sol 메소드를 생성하여 소수를 구하고 참/거짓을 리턴받도록 함
 * 파라미터가 1, 2 일 경우 소수가 아닌 수로 판단하여 거짓을 반환함
 * 약수의 갯수는 일정해야하는데 1을 소수로 정의하게되면 1의 약수가 1이 되므로 소인수분해의 유일성이 깨지게 됨(ex. 2 = 1*1*2 ...)
 * 1이 소수인 것을 피하기 위해 나누는 수를 2부터 시작하여 2가 소수가 아닌 수로 되어버림으로써 파라미터가 2일 경우 거짓을 반환함
 * 위와 같은 결과로 파라미터가 1, 2일 때 오답처리되었음
 * */
public class Q1929 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String[] ary = br.readLine().split(" ");
    int a = Integer.parseInt(ary[0]);
    int b = Integer.parseInt(ary[1]);
    for (int i = a; i <= b; i++) {
      if (sol(i)) {
        sb.append(i).append("\n");
      }
    }
    System.out.print(sb);
  }

  static boolean sol(int a) {
    if (a <= 1) return false;
    if (a == 2) return true;
    int v = 2;
    while (true) {
      if (a%v == 0)
        return false;
      if (a/v <= v++)
        break;
    }
    return true;
  }
}
