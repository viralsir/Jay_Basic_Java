package interfacedemo;

import java.util.Scanner;



public class interfacedemo implements i1
{



    @Override
    public float getInput()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Radius:");
        float radius=s.nextFloat();

        return radius;
    }

    @Override
    public float calculateArea(float radius) {
            float area=pi*radius*radius;

        return area;
    }

    @Override
    public void displayArea(float area) {
        System.out.println("Area:"+area);
    }

    void classdisplay()
    {
        System.out.println("class display is called");
    }

    public static void main(String[] args) {

        interfacedemo inf=new interfacedemo();
        //i1 inf=new interfacedemo();
        //inf.pi=45.44f;
        float radius= inf.getInput();
        float area=inf.calculateArea(radius);
        inf.displayArea(area);
        inf.classdisplay();

        // inf.displayArea(inf.calculateArea(inf.getInput()));



    }


}
