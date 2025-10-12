import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int first=0;
        int second=1;
        int next;
        for(int i=0;i<num;i++){
            System.out.println(first);
            next=first+second;
            first=second;
            second=next;
        }
    }
}