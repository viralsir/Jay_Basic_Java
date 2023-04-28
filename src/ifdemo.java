import java.util.Scanner;

/*

    Relational Operator
    operator            symbol
    grater than             >
    less than               <
    equal to                ==
    greater than or
    equal to                >=
    less than or
    equal to                <=
    not equal to            !=

    Logical operator
    operator            symbol
    and                  &&
    or                   ||
    not                  !




         conditional control structure
         1)if
                 syntax :
                        if(condition)
                        {
                            true part;
                            statement;
                         }
                         else
                         {
                            false part;
                            statement;
                          }
               i)if else

               ii)else if
               iii)nested if
         2)switch
 */
public class ifdemo {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=s.nextLine();
        System.out.println("name:"+name);

        System.out.print("Enter No1:");
        int no1=s.nextInt();
        System.out.print("Enter No2:");
        int no2=s.nextInt();
        System.out.println("Enter No3:");
        int no3=s.nextInt();

        if(no1>0 && no2>0 && no3>0)
        {
            // neseted if
            if(no1>no2 && no1>no3)
            {
                System.out.println(no1+" is a maximum no");
            }
            else if(no2>no1 && no2>no3)
            {
                System.out.println(no2+" is a maximum no");
            }
            else
            {
                System.out.println(no3+" is a maximum no");
            }
        }
        else
        {
            System.out.println("invalid input");
        }




    }
}
