import java.util.*;

public class Automorphic{
    public static int countofdigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int square=num*num;
        int digits=countofdigits(num);

        int modulus=(int)Math.pow(10,digits);

        if(square % modulus==num){
            System.out.println("Automorphic number");
        }else{
            System.out.println("Not Automorphic number");
        }
    }
}