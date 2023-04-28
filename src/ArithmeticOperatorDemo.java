import java.util.Scanner;

public class ArithmeticOperatorDemo {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int no1=23,no2=33;
        System.out.print("Enter No1:");
        no1=s.nextInt();
        System.out.print("Enter No2");
        no2=s.nextInt();


        System.out.println("Addition :"+(no1+no2));
        System.out.println("Substraction :"+(no1-no2));
        System.out.println("Multiplication :"+(no1*no2));
        System.out.println("Division :"+(no1/no2));
        System.out.println("module :"+(no1%no2));
    }
}
