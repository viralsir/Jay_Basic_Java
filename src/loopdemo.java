import java.util.Scanner;

/*
    circular control structure
        loop
                    syntax :
                             while
                                syntax:
                                        inititalization of variable;
                                        while(condition)
                                        {
                                             true part;
                                             statement;
                                             increment/ decrement of variable;
                                          }

                             dowhile
                             for
 */
public class loopdemo
{
    public static void main(String[] args) {
        //int i=100;
       /* while(i>=0)
        {
            System.out.println(i);
            //i=i+10;
            i-=10;
        }*/

        Scanner s=new Scanner(System.in);
        /*System.out.println("Enter Starting no:");
        int start=s.nextInt();
        System.out.println("Enter Ending no:");
        int end=s.nextInt();

        while(start<=end)
        {
            System.out.println(start);
            start+=1;
        }*/

        /*System.out.println("Enter No:");
        int no=s.nextInt();
        int start=1;
        while(start<=20)
        {
            System.out.println(no+" * "+ start+" = "+ start*no);
            start=start+1;
        }*/


       /* System.out.println("Enter No:");
        int no=s.nextInt();
        int start=1;
        System.out.println("divisior :");
        while(start<=no)
        {
            if(no%start==0)
            {
                System.out.print(start+" ");
            }
            start+=1;
        }*/

        /*System.out.print("Enter No:");
        int no=s.nextInt();
        int sum=0,factorial=1;
        int start=1;
        while(start<=no)
        {
            sum=sum+start;
            factorial=factorial*start;
            start=start+1;

        }
        System.out.println("Sum of all nos :"+sum);
        System.out.println("Sum of all nos:"+(no*(no+1))/2);
        System.out.println("factorial of given no:"+factorial);
*/
        int sum=0;
        int start=1;
        while(start<=5)
        {
            System.out.print("Enter No:");
            int no=s.nextInt();
            sum=sum+no;
            start=start+1;
        }
        System.out.println("Sum of all nos :"+sum);




        System.out.println("\noutside while loop");
    }
}
