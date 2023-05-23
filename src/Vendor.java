import java.util.ArrayList;
import java.util.Scanner;

public class Vendor extends Personal
{

    int billId;
    String billDate;
    float totalAmount;
    float discount;
    float tax;
    float netAmount;
    ArrayList<Product> ProductList=new ArrayList<Product>();

    void setVendor()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Bill Id:");
        this.billId=s.nextInt();
        System.out.print("Enter Bill Date :");
        this.billDate=s.next();
        this.setPersonal("Vendor");
        String option="yes";
        do
        {
              Product product=new Product();
              product.setProduct();
              this.totalAmount=this.totalAmount+ product.price;
              this.ProductList.add(product);
              System.out.print("Do you want to add another product (y/n)?:");
              option=s.next();

        }while(option.equalsIgnoreCase("y"));

        System.out.print("Enter Discount(%):");
        this.discount=s.nextFloat();
        this.discount=(this.totalAmount*this.discount)/100;
        System.out.print("Enter Tax (%):");
        this.tax=s.nextFloat();
        this.tax=(this.totalAmount*this.tax)/100;

        this.netAmount=this.totalAmount-this.discount+this.tax;


    }


    void getVendor()
    {
        System.out.println("Bill Id:"+this.billId);
        System.out.println("Bill Date :"+this.billDate);
        this.getPersonal("Vendor");

        System.out.println("Id \t Name \t Qty \t Rate \t Price ");
        System.out.println("=============================================================================");
        for (Product product:this.ProductList)
        {
           product.getProduct();
        }

        System.out.println("Total Amount :"+this.totalAmount);
        System.out.println("Discount :"+this.discount);
        System.out.println("Tax :"+this.tax);
        System.out.println("Net Amount :"+this.netAmount);

    }

}
