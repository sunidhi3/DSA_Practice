package Pattern;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        boolean isprime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
               isprime=false;
               break;
            }
        }
        return isprime;
    }
}
