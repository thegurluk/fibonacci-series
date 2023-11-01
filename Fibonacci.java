import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number for fibonacci series:");
        int series= input.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.println("0");
        System.out.println("1");
        for (int i=1;i<=(series-2);i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
