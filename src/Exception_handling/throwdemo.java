package Exception_handling;

/*
    exception

    finally : block {}
    final : keyword constant
    finalise() : function  : to free the memmory of object.

 */

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception
{
    String msg;
    MyException(String msg)
    {
        this.msg=msg;
    }
     public String toString()
    {
        return msg;
    }

}


public class throwdemo {

    final int no=34;

//    static void getNo()
//    {
//        System.out.println(no);
//
//    }
    public static void main(String[] args)
    {
        //final int no=34;
        throwdemo th1=new throwdemo();
        throwdemo th2=new throwdemo();
       // th1.no=44;
        System.out.println(th1.no);
        System.out.println(th2.no);

//        System.out.println(throwdemo.no);

         //  throwdemo.getNo();
        /*try
        {
            Scanner s=new Scanner(System.in);

            System.out.println("Enter No1:");
            int no1=s.nextInt();
            System.out.println("Enter No2:");
            int no2=s.nextInt();

            if(no1>0 && no2>0)
            {
                if(no1>no2)
                    System.out.println(no1+" is maximum no");
                else
                    System.out.println(no2+" is maximum no");
            }
            else
            {
                if(no1<0)
                    throw new MyException("first no is Nagetive no are not allowed");
                else
                    throw new MyException("second no is Nagetive no are not allowed");
            }
            System.out.println("end if program ");

        }
        catch (MyException me)
        {
            System.out.println(me);
        }
        catch (InputMismatchException ie)
        {
            System.out.println("Character are not allowed");
        }
        System.out.println("end program ");
*/

    }



}
