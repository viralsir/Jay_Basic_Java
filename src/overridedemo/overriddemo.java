package overridedemo;

// for school
/*class student
{
    int rollno;
    String name;

    void entry();
    void view();
    void update();

}

 */
// for institute
/*class student
{
     int id;
     String name;
     String course;
     int fees;


     void setStudent(){};
     void  getStudent(){};
}
*/



/*interface  shape
{

    float pi=3.14f;
    public void area();
}
*/
class shape
{
    float radius;
    float area;
    float pi=3.14f;

    public void area()
    {

    }

}
class circle extends shape
{
    float radius;
    float area;

    public void area(float radius)
    {
        area=pi*radius*radius;
    }

    @Override
    public void area() {

    }
}

class Oval extends shape
{
    public void area()
    {
        area=pi*radius*radius*radius;

    }
    public void basearea()
    {
        super.area();
    }
}


public class overriddemo
{
    public static void main(String[] args) {
        circle ch=new circle();
        ch.area();

    }
}
