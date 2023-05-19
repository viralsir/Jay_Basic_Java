import java.util.ArrayList;
import java.util.Scanner;


/*

rollno=[1,2,3]
student_arraylist=[1,"vimal",23,33,44,2,"vishal",34,55,66]
student_arraylist=[student(),student()]

student{
    int rollno
    String    name
    int    maths
    int     sci
    int     phy
        }

        student s1,s2;
*/

public class Student_ArrayList_Demo
{
    public static void main(String[] args) {

        ArrayList<Integer> rollno_List=new ArrayList<Integer>();
        ArrayList<String> name_List=new ArrayList<String>();
        ArrayList<Integer> maths_list=new ArrayList<Integer>();
        ArrayList<Integer> science_list=new ArrayList<Integer>();

        Scanner s=new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Roll No:");
            rollno_List.add(s.nextInt());
            System.out.println("Enter Name:");
            name_List.add(s.next());
            System.out.println("Enter Maths marks:");
            maths_list.add(s.nextInt());
            System.out.println("Enter Science Marks:");
            science_list.add(s.nextInt());

        }
        System.out.println("\n output \n");
        for (int index = 0; index < rollno_List.size(); index++)
        {
            System.out.println("Roll No:"+rollno_List.get(index));
            System.out.println("Name:"+name_List.get(index));
            System.out.println("Maths marks:"+maths_list.get(index));
            System.out.println("Science marks:"+science_list.get(index));
        }











    }
}
