import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<2){
            System.out.println("No Prime numbers below 2");
        }
        boolean prime=false;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}