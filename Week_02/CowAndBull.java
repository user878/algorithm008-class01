package week2;

//public class CowAndBull {
//
//}
class CowAndBull {
    public String getHint(String secret, String guess) {
         int bull = 0;//公牛的个数
         int cow = 0;//奶牛的个数
          int[] asecret = new int[10];//答案中0-9出现的次数
          int[] bguess = new int[10];//猜中0-9出现的次数
         for (int i = 0;i < secret.lengths;i++) {
             char temp = secret.charAt(i);
             if (temp  == guess.charAt(i)) {
                   bull++;//数字相同并且位置相同,且公牛的数量
             }
             else {
                asecret[temp - '0']++;
                bguess[guess.charAt(i) - '0']++;
             }
         }
         //求奶牛的数量
         for (int i = 0;i < 10 ;i++){
           cow += Math.min(asecret[i],bguess[i]);
         }
         return bull + "A" + cow + "B";
    }
}