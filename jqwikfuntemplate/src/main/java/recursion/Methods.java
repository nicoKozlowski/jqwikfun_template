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
  
  static int fact(int n) {
    return n <= 1 ? 1 : n * fact(n - 1);
  }

  static int binom(int n, int k) {
    return k == 0 || k == n ? 1 : k < 0 || k > n ? 0 : binom(n - 1, k - 1) + binom(n - 1, k);
  }

  static int ggT(int a, int b) {
    return b == 0 ? a : ggT(b, a % b);
  }

  static int fib(int n) {
    return n == 0 ? 0 : n == 1 ? 1 : fib(n - 1) + fib(n - 2);
  }
}

