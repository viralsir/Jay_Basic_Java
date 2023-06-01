package Exception_handling;
/*
  Exception Handling : -
  Exception : IS A MESSAGE WHICH IS BEING DISPLAY WHEN RUN TIME ERROR IS OCCURED.

    try
    catch
    finally
    throws   ignore the exception compile time exception
    throw    throw object of user define exception



 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatchdemo
{
    public static void main(String[] args) {

        boolean flag=true;
        while(flag==true)
        {

            try
            {
                Scanner s = new Scanner(System.in);

                int no1 = 1, no2 = 1;

                System.out.println("Enter No1:");
                no1 = s.nextInt();
                System.out.println("Enter No2:");
                no2 = s.nextInt();


                int ans = no1 / no2;

                System.out.println("Answer :" + ans);
                flag=false;
            } catch (ArithmeticException ie) {
                System.out.println("zero is invalid");

            }
            //catch (InputMismatchException ie) {
//                System.out.println("character are invalid");
//            }
            finally {
                if(!flag)
                    System.out.println("proper");
                else
                    System.out.println("improper");
                System.out.println("finally block is executed.");
            }
        }
        System.out.println("end program");

    }

}
