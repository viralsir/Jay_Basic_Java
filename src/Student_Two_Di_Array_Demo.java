import java.util.Scanner;

/*
    level 0
          Search
           rollno
           pass/fail
   level - 1
            division wise student list (A ,B,C,D)
   level - 2
           standard - division - student list

 */

public class Student_Two_Di_Array_Demo
{
    public static void main(String[] args)
    {
        int[] rollno=new int[50];
        String[] name=new String[50];
        int[][] subject_marks=new int[50][4];
        String[] title={"Maths:","Science","English","PHY:"};
        Scanner s=new Scanner(System.in);
        int option=0;
        int i=0;
        final int PASSING_MARKS=35;
        do
        {
            System.out.println("\n\t\t\t Student Corner ");
            System.out.println("\t\t press 1 for Entry ");
            System.out.println("\t\t press 2 for View ");
            System.out.println("\t\t press 3 for Exit ");

            System.out.print("Enter Your option :");
            option=s.nextInt();

            switch (option)
            {
                case 1:
                    String option2="";

                    do
                    {
                        System.out.print("Enter Roll No:");
                        rollno[i]=s.nextInt();
                        System.out.print("Enter Name:");
                        name[i]=s.next();
                        for (int j = 0; j < title.length; j++)
                        {
                            System.out.print("Enter "+title[j]);
                            subject_marks[i][j]=s.nextInt();
                            while (subject_marks[i][j]<0 || subject_marks[i][j]>100)
                            {
                                System.out.println("invalid marks ");
                                System.out.println("Enter "+title[j]);
                                subject_marks[i][j]=s.nextInt();
                            }
                        }
                        System.out.println("Do you want to Continue (y/n)?:");
                        option2=s.next();
                        i++;
                    }while(option2.equalsIgnoreCase("y"));


                    break;
                case 2:
                    for (int index = 0; index < i; index++)
                    {
                        System.out.println("=============================================");
                        System.out.print("\n Roll No:"+rollno[index]);
                        System.out.print("\n Name:"+name[index]+"\n");
                        boolean is_pass=true;
                        int sum=0;
                        for (int j = 0; j < title.length; j++)
                        {
                            if(subject_marks[index][j]<PASSING_MARKS)
                            {
                                is_pass=false;
                            }
                            System.out.println(title[j]+" "+subject_marks[index][j]);
                            sum += subject_marks[index][j];
                        }

                        if(is_pass)
                        {
                            System.out.println("You are passed");
                            System.out.println("Total :"+sum);
                            float avg=(float)sum/ title.length;
                            System.out.println("Avg :"+avg);

                            if(avg>90)
                                System.out.println("Grade : A");
                            else if(avg>70)
                                System.out.println("Grade:B");
                            else if(avg>55)
                                System.out.println("Grade :C");
                            else
                                System.out.println("Grade : D");
                        }
                        else {
                            System.out.println("you are fail");
                        }

                    }

                    break;
                case 3:
                    System.out.println("you are exited");
                    break;
                default:
                    System.out.println("Wrong option selected try again !!");
                 break;
            }


        }while(option!=3);






    }
}
