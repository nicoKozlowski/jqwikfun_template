package recursion;

public class Methods {
  static int add(int x, int y){
    return y == 0
            ? x
            : add(++x,--y);
  }

  static int collatz(int n) {
    if (n == 1) return 1;
    else if (n % 2 == 0) return collatz(n / 2);
    else return collatz(3*n + 1);
  }

  static int bad(int a, int b, int c, int d, int e, int f, int g){
    return 0;
  }

}

