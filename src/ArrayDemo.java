import java.util.Scanner;

/*
        Array :  is a collection of same type of data.
             or
             is a shared name of multiple memmory block
             or
             is a derived data type

             int no;
             no=23;
             no=45;

             int rollno1,rollno2,-----------,rollno50000
             int maths
             int rollno[50],  one di numeric array
             rollno[0] ,  rollno[1],---- rollno[49]
             rollno=1
             rollno=2

    syntax :
        datatype arrayname[]=new datatype[size];


 */
public class ArrayDemo
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        int[] no={23,33,44,55,6,77};   //initialization of variable

//        System.out.println(no[2]);
//        no[2]=3444;
//        System.out.println(no[2]);


//        for (int index = 0; index < no.length; index++)
//        {
//            System.out.println(no[index]);
//        }

        for(int element:no)
        {
            if(element%2==0)
                System.out.println(element);
        }


//        int rollno=0,maths=0,sci=0,eng=0;
//        String name="";
//
 /*       int[] rollno =new int[5];
        int maths[]=new int[5];
        int sci[]=new int[5];
        int eng[]=new int[5];
        String name[]=new String[5];


        for (int i = 0; i <3 ; i++)
        {
            System.out.print("Enter Student Roll No:");
            rollno[i]=s.nextInt();
            System.out.print("Enter Student Name :");
            name[i]=s.next();
            System.out.print("Enter Student Maths Marks:");
            maths[i]=s.nextInt();
            System.out.print("Enter Student Science Marks:");
            sci[i]=s.nextInt();
            System.out.print("Enter Student English Marks:");
            eng[i]=s.nextInt();

        }

        System.out.println("\n output :\n");

        for (int i = 0; i <3 ; i++)
        {
            System.out.println("Student Roll No:"+ rollno[i]);
            System.out.println("Student Name :"+ name[i]);
            System.out.println("Student Maths Marks:"+ maths[i]);
            System.out.println("Student Science Marks:"+ sci[i]);
            System.out.println("Student English Marks:"+ eng[i]);

        }
*/

    }
}

















