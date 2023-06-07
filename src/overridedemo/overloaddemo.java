package overridedemo;

/*
      polymorphism : one name multiple use
       overloading

       function overloading

       constructor overloading


       jpa
       client - server programming

       spring boot 4.0
       spring mvc  3.0

       Html,CSS,BootStrap,JavaScript(Ajax)(DOM),Angular (google) (SPA ),
       React(facebook)  ,

       client - server proramming
       servlet & jdbc (jpa)
       jsp  & jpa

       spring (DI)
       spring boot (jpa)
       rest api
       SQl

       dynamic website
       rest api




 */

public class overloaddemo
{
    float discount;

    overloaddemo()
    {
        discount=0;
    }
    overloaddemo(float discount)
    {
        this.discount=discount;

    }



     public void area(float radius)
     {

     }
     public void area(float length,float width)
     {

     }
    public void total(int no1,int no2)
    {
        System.out.println("Total :"+(no1+no2));
    }

    public void total(int no1,int no2,int no3)
    {
        System.out.println("total :"+(no1+no2+no3));
    }

    public static void main(String[] args) {
        overloaddemo od=new overloaddemo();
        overloaddemo o1=new overloaddemo(23);
        od.total(12,23);
        od.total(23,33,44);
    }

}
