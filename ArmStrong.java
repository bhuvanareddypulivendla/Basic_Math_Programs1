import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ArmStrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int d=num;
        int arm=0;
        while(num>0){
            int a=num%10;
            num=num/10;
            arm=arm+(a*a*a);
        }
        if(d==arm){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}