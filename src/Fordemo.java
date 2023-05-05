import java.util.Scanner;

/*
     for
     syntax :
        for(initialization of variable; condotion;incrment/decrement of variable)
        {
              statement  ;
              true part;
           }
 */
public class Fordemo
{
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//
//        }

        Scanner s=new Scanner(System.in);

        /*System.out.println("Enter Starting value :");
        int start=s.nextInt();
        System.out.println("Enter Ending Value:");
        int end=s.nextInt();
        for (int i = start; i < end; i++)
        {
            System.out.println(i);
        }*/

//        int sum=0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter No:");
//            int no=s.nextInt();
//            sum=sum+no;
//        }
//        System.out.println("Sum :"+sum);

        // check wheater the give no is prime or not ?

        for(int no=1;no<=100;no++)
        {
            boolean is_prime=true;
            for(int i=2;i<no;i++)
            {
                if(no%i==0)
                {
                    is_prime=false;
                    break;
                }
            }
            if(is_prime)
            {
                System.out.println(no);
            }

        }




    }

}
