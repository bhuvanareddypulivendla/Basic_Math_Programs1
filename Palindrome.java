import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int d=num;
        while(num>0){
            int r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        if(d==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}