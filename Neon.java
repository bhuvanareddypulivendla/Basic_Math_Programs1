import java.util.*;

public class Neon{
    public static int Neon(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum +=digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int square=num*num;
        int sum=Neon(num);

        if(sum==num){
            System.out.println("Neon number");
        }else{
            System.out.println("Not Neon number");
        }
    }
}