/*
PEPCODING LEVEL-1 INTRODUCTION TO RECURSION


POWER LOGARITHMIC

*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int xn=power(x,n);
        System.out.println(xn);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xpnb2=power(x,n/2);
        int xn=xpnb2*xpnb2;
        
        if(n%2==1){
            xn=xn*x;
        }
        return xn;
    }

}