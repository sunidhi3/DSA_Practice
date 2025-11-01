import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float principal=sc.nextFloat();
        float rate=sc.nextFloat();
        float time=sc.nextFloat();
        float si=(principal*rate*time)/100;
        System.out.println("simple interest : "+si);
        sc.close();
    }
}
