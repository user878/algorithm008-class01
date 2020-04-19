public class water {
    public int maxArea(int[] a) {
     //1.把面积一个个列举出来，一个个比较面积的大的
//        int max = 0;
//        for (int i = 0; i < a.length-1; i++) {
//            for (int j = 1;j <a.length; j++) {
//                int area = (j - i)*Math.min(a[i],a[j]);
//                max = Math.max(max,area);
//            }
//        }
//        return max;
        //2.选左右边界
        int max = 0;
        for (int i = 0,j = a.length -1 ; i<j;) {
            int minheight = a[i] < a[j]? a[i+1] : a[j-1];
            int area = (j - i + 1)*minheight;
            max = Math.max(max,area);
        }
        return max;
    }
}
