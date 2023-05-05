import java.util.Scanner;

/*
             nested while : while within while

              while()
              {

              }

              1
              1 2 3
              1 2 3 4
              3 4 5  6 5
              3 5 5 6 7


 */
public class NestedWhileDemo {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter no:");
        int no=s.nextInt(); // 5 - 9 6 - 11 7 13

        int i,j,m;
        i=1;m=1;
        while(i<=(2*no-1))
        {
            j=no+1;
            while(j>=1)
            {
                if(j>m)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(j+"   ");
                }
                j=j-1;
            }
            System.out.println("");
            if(i<no)
            {
                m++;
            }
            else
            {
                m--;
            }
            i=i+1;
        }
    }
}
/*



 */
