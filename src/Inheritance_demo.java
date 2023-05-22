/*
    Inheritance : is  the proccess by which object of one class can access or get the properties of object of
    another class.

    class A    super class/ parent class / base class
    {
       int noA;
      }
      A a1=new A();
      a1.noA;

      sub class / child class /derived class
      class B extend A
      {
        int noB;
       }
       B b1=new B();
       b1.noB;
       b1.noA


       1) Single Inheritance :  one object can access only one object at a time    .
               A super class
               |
               B   sub class
       2) Multilevel Inheritance : continous chain of single inheritance

               A
               |
               B
               |
               C
       3) hyrarchical inheritance : more than one  object can access or get the properties of same object.

                           A
                     |             |
                     B              C

      4) multiple Inheritance : one object can access or get the properties of
      more than one object at a time . not supported in java

                           A               B
                                   |
                                   C
    5) hybrid inheritance : combination of more than one inheritance

                       A
                       |
                       B
                 |          |
                 C           D


 */

import java.util.Scanner;

public class Inheritance_demo
{

    public static void main(String[] args) {
        /* single inheritance
        Employee emp=new Employee();
        emp.setPersonal_info();
        emp.setSalary();
        emp.getPersonal_Info();
        emp.getSalary();

         */

        /*   multilevel inheritance
           Dmart dmart=new Dmart();
           dmart.setPersonal_info();
           dmart.setSalary();
           dmart.setLocation();

           dmart.getPersonal_Info();
           dmart.getSalary();
           dmart.getLocation();
        */
        /*  Hyrarchical inheritance

         */
          Employee employee=new Employee();
          employee.setPersonal_info("Employee");
          employee.setSalary();

          employee.getPersonal_Info();
          employee.getSalary();


          Customer customer=new Customer();
          customer.setPersonal_info("Customer");
          customer.setCustomer();

          customer.getPersonal_Info();
          customer.getCustomer();







    }
}

class Personal_Info
{
    int id;
    String name;
    String address;
    String phno;

       void setPersonal_info(String title)
       {
           Scanner s=new Scanner(System.in);

           System.out.println("Enter "+title+" Id:");
           this.id=s.nextInt();
           System.out.println("Enter "+ title+" Name:");
           this.name=s.next();
           System.out.println("Enter "+title+" Address:");
           this.address=s.next();
           System.out.println("Enter "+title+" Phno:");
           this.phno=s.next();


       }

       void getPersonal_Info()
       {
           System.out.println("Id :"+this.id);
           System.out.println("Name:"+this.name);
           System.out.println("Address:"+this.address);
           System.out.println("Phno:"+this.phno);
       }

}

class Employee extends Personal_Info
{
    int salary;

    int id;
    void setSalary()
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Salary :");
        this.salary=s.nextInt();
    }
    void getSalary()
    {
        System.out.println("Salary :"+this.salary);
    }

}


class  Customer extends Personal_Info
{
        int billno;
        int billamount ;

        void setCustomer()
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter bill NO:");
            this.billno=s.nextInt();
            System.out.println("Enter bill Amount:");
            this.billamount=s.nextInt();
        }

        void getCustomer()
        {
            System.out.println("bill No:"+this.billno);
            System.out.println("Bill Amount :"+this.billamount);
        }

}


class Dmart extends Employee
{
    String location;

     void setLocation()
     {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter Location:");
         this.location=s.next();
     }
     void getLocation()
     {
         System.out.println("Location :"+this.location);
     }
}


