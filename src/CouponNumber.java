import java.util.Scanner;

public class CouponNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many coupon number you want: ");
        int num = sc.nextInt();
        char [] chars="abcdefghijklmnopqrstuvwxyz@#$%&*0123456789".toCharArray();
        int max = 100000000;
       int randome = (int)(Math.random()*max);
        StringBuffer n = new StringBuffer();

        while(randome>0){
            for (int i=0; i<=num; i++) {

                 System.out.println("number:" +chars.length);
                 n.append(chars[randome% chars.length]);
                 randome /= chars.length;

            }
        }

        String couponCode = n.toString();
        System.out.println("coupon code " +couponCode);
        return;
    }
}