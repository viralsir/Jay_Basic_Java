package model;

public class StudentDatabase
{
    public static void main(String[] args) {
         Student student=new Student();

         student.setId(2);
         student.setName("viren");
         student.setFees(23000);
         student.setCourse("Java language");

         StudentDB studentDB=new StudentDB();

        /* if(studentDB.insert(student))
         {
             System.out.println("record is inserted");

         }
         else {
             System.out.println("record is not inserted");
         }*/

        System.out.println("output :\n");

        for (Student student1 : studentDB.view())
        {
            System.out.println(student1.getId()+" "
            + student1.getName()+" "+student1.getCourse()+" "+student1.getFees());
        }


    }
}
