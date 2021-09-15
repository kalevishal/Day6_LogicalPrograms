import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverse=0 ;
         Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        while (n!=0){
            int reminder = n%10; 
                                
            reverse = reverse*10+reminder; 
            n=n/10;

        }
        System.out.println("the reverse number is "+reverse);

    }
}