class dc {
    public int[] sortedSquares(int[] A) {
        int a[] =new int [A.length];
        for (int i = 0,j = 0 ;i < A.length;i++,j++) {
            a [j] = A[i]*A[i];
        }
        Arrays.sort(a);
        return a;
    }
}