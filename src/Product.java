import java.util.Objects;
import java.util.Scanner;

public class Product
{
    int id;
    String name;
    int qty;
    float rate;
    float price;

    void setProduct()
    {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter Product Id:");
        this.id=s.nextInt();
        System.out.print("Enter Product Name :");
        this.name=s.next();
        System.out.print("Enter Product Qty :");
        this.qty=s.nextInt();
        System.out.print("Enter Product Rate:");
        this.rate=s.nextFloat();

        this.price=this.rate*this.qty;

    }

    void getProduct()
    {
        System.out.println(this.id+"\t"+this.name+"\t"+this.qty+"\t"+this.rate+"\t"+this.price);
    }

}
