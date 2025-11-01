import java.util.Scanner;

public class print1to10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int i=1;
        // while(i<=n){
        //     System.out.print(i+" ");
        //     i++;
        // }
        // for(int i=1;i<=n;i++){
        //     System.out.print(i+" ");
        // }
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=n);
        sc.close();
    }
}
