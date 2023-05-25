import lib.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Customers extends Personal
{

    int billId;
    String billDate;
    float totalAmount;
    float discount;
    float tax;
    float netAmount;
    ArrayList<Product> ProductList=new ArrayList<Product>();

    void setCustomers()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Bill Id:");
        this.billId=s.nextInt();
        System.out.println("Enter Bill Date :");
        this.billDate=s.next();
        this.setPersonal("Customer");
        String option="yes";
        do
        {
              Product product=new Product();

              product.setProduct();
              this.totalAmount=this.totalAmount+ product.price;
              this.ProductList.add(product);
              System.out.println("Do you want to add another product (y/n)?:");
              option=s.next();

        }while(option.equalsIgnoreCase("y"));

        System.out.println("Enter Discount(%):");
        this.discount=s.nextFloat();
        this.discount=(this.totalAmount*this.discount)/100;
        System.out.println("Enter Tax (%):");
        this.tax=s.nextFloat();
        this.tax=(this.totalAmount*this.tax)/100;

        this.netAmount=this.totalAmount-this.discount+this.tax;


    }


    void getCustomers()
    {
        System.out.println("Bill Id:"+this.billId);
        System.out.println("Bill Date :"+this.billDate);
        this.getPersonal("Customer");

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
