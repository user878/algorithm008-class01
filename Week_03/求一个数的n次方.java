package week3;

class Solution {
    private double fastPow(double x, long n) {
        if (n == 0){
            return 1.0;
        }
        double half = fastPow(x,n/2);
        if (n % 2 == 1) {
           return half * half * x;
        }else {
            return half * half;
        }
    }
    public double mypow(double x,int n){
            long N = n;
            if (N < 0) {
                 x = 1/x;
                 N = -N;
            }
            return fastPow(x,N);
    }
}

