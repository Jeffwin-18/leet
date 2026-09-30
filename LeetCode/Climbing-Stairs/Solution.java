1class Solution {
2    public int climbStairs(int n) {
3        
4        if (n == 1) return 1;
5        if (n == 2) return 2;
6        if (n == 3) return 3;
7
8        int[] fib = new int[n];
9        fib[0] = 1;
10        fib[1] = 2;
11
12        for (int i = 2; i < n; i++) {
13            fib[i] = fib[i - 1] + fib[i - 2];
14        }
15
16        return fib[n - 1];
17    }
18}