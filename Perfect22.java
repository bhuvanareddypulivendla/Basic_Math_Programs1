import java.util.*;

public class Perfect22{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sqrt=(int)Math.sqrt(n);
        if(sqrt*sqrt==n){
            System.out.println("Perfect Square..");
        }else{
            System.out.println("Not a perfect Square..");
        }

        int cbrt=(int)Math.cbrt(n);
        if(cbrt*cbrt*cbrt==n){
            System.out.println("Perfect Cube..");
        }else{
            System.out.println("Not a perfect Cube..");
        }
    }
}