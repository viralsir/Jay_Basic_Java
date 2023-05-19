
/*
    class : is a bunch of related data.

            or
           is a collection of data and on its proccess

            or
            is a Abstract Data type / User Define data type

            int   no
            char  name
            student  s1.rollno=1,s2.rollno=2


    class  student  (pref)
    {
         data   : information rollno,name,address,std,div

         method :process   new ,view ,update,delete , search , viewbypass,viewbypasssubject

    }



    class course
    {
          data : id ,name,fees,duration,description,status

          method: new ,view ,update ,search
      }


 */

import java.util.ArrayList;
import java.util.Scanner;

public class Student
{
     int rollno;
     String name;
     int maths;
     int science;



     void entry()
     {
         Scanner s=new Scanner(System.in);

         System.out.println("Enter Roll No:");
         rollno=s.nextInt();

         System.out.println("Enter Name :");
         name=s.next();
         System.out.println("Enter Maths Marks:");
         maths=s.nextInt();
         System.out.println("Enter Science Marks:");
         science=s.nextInt();
     }

     void view()
     {
         System.out.println("Roll No:"+rollno);
         System.out.println("Name :"+name);
         System.out.println("Maths :"+maths);
         System.out.println("Science :"+science);
     }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        //Student s1=new Student();
        //Student s2=new Student();
        //Student[] student=new Student[50];

        ArrayList<Student> studentList=new ArrayList<Student>();

        for (int index = 0; index < 2; index++)
        {
            Student student=new Student();
            student.entry();
            studentList.add(student);

        }


        /*for (int index = 0; index < 2; index++)
        {
            student[index]=new Student();
            System.out.println("Enter Roll No:");
            student[index].rollno=s.nextInt();
            System.out.println("Enter Name :");
            student[index].name=s.next();
            System.out.println("Enter Maths Marks:");
            student[index].maths=s.nextInt();
            System.out.println("Enter Science Marks:");
            student[index].science=s.nextInt();

        }
   */
        for (Student st:studentList)
        {
            st.view();

        }

        /* System.out.println("Enter Roll No:");
        s1.rollno=s.nextInt();
        System.out.println("Enter Name :");
        s1.name=s.next();
        System.out.println("Enter Maths Marks:");
        s1.maths=s.nextInt();
        System.out.println("Enter Science Marks:");
        s1.science=s.nextInt();

        System.out.println("Enter Roll No:");
        s2.rollno=s.nextInt();
        System.out.println("Enter Name :");
        s2.name=s.next();
        System.out.println("Enter Maths Marks:");
        s2.maths=s.nextInt();
        System.out.println("Enter Science Marks:");
        s2.science=s.nextInt();


        System.out.println("\n output :\n");
        System.out.println("Roll No:"+s1.rollno);
        System.out.println("Name :"+s1.name);
        System.out.println("Maths :"+s1.maths);
        System.out.println("Science :"+s1.science);
        System.out.println("Roll No:"+s2.rollno);
        System.out.println("Name :"+s2.name);
        System.out.println("Maths :"+s2.maths);
        System.out.println("Science :"+s2.science);





        //new Student().rollno=34;
        //System.out.println(new Student().rollno);
//        Student s1=new Student();
//        s1.rollno=34;
//        System.out.println(s1.rollno);

//        Student s1=new Student();
//        Student s2=new Student();
//        Student s3=s1;
//        Student s4=s2;
//        s1.rollno=34;
//        s1=s2;
//        s2.rollno=45;
//        s3=s4;
//        s1.rollno=123;
//        s2.rollno=3333;
//        System.out.println(s4.rollno);
  */

    }




}
