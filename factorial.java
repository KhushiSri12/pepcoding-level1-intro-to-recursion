/*
PEPCODING LEVEL-1 INTRODUCTION TO RECURSION


FACTORIAL
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=factorial(n);
        System.out.println(f);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fm1=factorial(n-1);
        int fn=n*fm1;
        return fn;
    }

}
