import java.util.*;

public class Power{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        int result=1;

        for(int i=1;i<=y;i++){
            result=result*x;
        }
        System.out.println(x+"^"+y+ " is " +result);
    }
}