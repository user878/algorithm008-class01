class andnumber {
    public int subtractProductAndSum(int n) {

        int sum = 0;
        int x = 1;
        while (n > 0) {
            int nn = n%10;
            sum += nn;
            x *= nn;
            n = n / 10;
        }
        return x-sum;
    }
}
