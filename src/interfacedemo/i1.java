package interfacedemo;

/*

    interface has only declaration of function
    all the function in the interface are by default public
    all the variable which are  declared inside an interface are by defult public and final
    a class which is implements an interface must define all the function which are declared inside an interface.


 */

public interface i1 {
   float pi=3.14f;
   float getInput();
   float calculateArea(float radius);
   void displayArea(float area);


}


