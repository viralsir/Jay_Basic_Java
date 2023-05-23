import java.util.Scanner;

public class Personal
{
    int id;
    String name;
    String address;
    String phno;

    void setPersonal(String title)
    {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter "+title+" id :");
        this.id=s.nextInt();
        System.out.print("Enter "+title+" Name:");
        this.name=s.next();
        System.out.print("Enter "+title+" Address :");
        this.address=s.next();
        System.out.print("Enter "+title+" Phno:");
        this.phno=s.next();

    }
    void getPersonal(String title)
    {
        System.out.println(title+ "Id :"+this.id);
        System.out.println(title+"Name:"+this.name);
        System.out.println(title+"Address:"+this.address);
        System.out.println(title+"Phno:"+this.phno);

    }
}
