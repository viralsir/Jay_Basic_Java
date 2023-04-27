/*
   variable : is a name of memmory location in which data is being stored.
   datatype : type of data

      category of datatype

       1) Primary Data type or Inbuilt Data type

       2) Derived Data type
       3) Abstract Data type

        1 byte =    8 bits

                Primary Data type

 keyword                 use                    byte                     range
 boolean             true/false                 jvm                         jvm
 byte                numeric value              1                           -128 to 127   0 to 255
 char               character,sybmol            2                           -32768 to 32767
 int                numeric value               4                           huge value
 long               numeric value               8                           very huge value
 float             numeric , floating value     8                           very huge value
 double             floating value              16                          very very huge value

 Assignment operator =>  =

  int no;    //  declaration of variable
   no=23;   // assign 23 to the no

  int no=12;  // initialization of variable




 */
public class DataTypeDemo
{
    public static void main(String[] args) {
        boolean b=true;
        byte y=23;
        char m='t';
        String name="vimal";
        int no=99;
        float fl=343434343.343f;
        double d=34343434343434.3434;

        //no=y;  // implicity type casting
        //  y=(byte)no;  // explicit type casting

        System.out.println("boolean b:" + b);
        System.out.println("byte y :"+y);
        System.out.println("char m:"+m);
        System.out.println("String name :"+name);
        System.out.println("int no:"+no);
        System.out.println("float fl:"+fl);
        System.out.println("double d:"+d);


    }
}
