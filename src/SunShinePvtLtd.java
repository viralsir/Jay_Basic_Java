import java.util.ArrayList;
import java.util.Scanner;

public class SunShinePvtLtd
{
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        ArrayList<Vendor> VendorList=new ArrayList<Vendor>();
        ArrayList<Customers> CustomerList=new ArrayList<Customers>();
        int option=0,option2=0;

        do
        {
            System.out.println("\t\t\t Sun Shine Pvt Ltd ");
            System.out.println("\t\t press 1 for Purchase");
            System.out.println("\t\t press 2 for Sale");
            System.out.println("\t\t press 3 for Exit");

            System.out.print("Enter Your Option:");
            option=s.nextInt();

            switch (option)
            {
                case 1:
                    do
                    {
                        System.out.println("\t\t\t  Purchase");
                        System.out.println("\t\t press 1 for Entry");
                        System.out.println("\t\t press 2 for View");
                        System.out.println("\t\t press 3 for Main Menu");

                        System.out.println("Enter your option :");
                        option2=s.nextInt();

                        switch (option2)
                        {
                            case 1:
                                String option3="";
                                do
                                {
                                    System.out.println("\t\t Entry ");
                                    Vendor vendor=new Vendor();
                                    vendor.setVendor();
                                    VendorList.add(vendor);
                                    System.out.println("do you want to add another bill ?(y/n):");
                                    option3=s.next();

                                }while(option3.equalsIgnoreCase("Y"));
                            break;
                            case 2:
                                System.out.println("\t\t View ");
                                for (Vendor vendor:VendorList)
                                {
                                   vendor.getVendor();
                                    System.out.println("===============================================================");
                                }

                            break;
                            case 3:
                                System.out.println("Back to main menu");
                            break;
                            default:
                                System.out.println("Wrong option Selected try again ");
                            break;

                        }

                    }while(option2 !=3);
                break;
                case 2:
                    do
                    {
                        System.out.println("\t\t\t  Sales");
                        System.out.println("\t\t press 1 for Entry");
                        System.out.println("\t\t press 2 for View");
                        System.out.println("\t\t press 3 for Main Menu");

                        System.out.println("Enter your option :");
                        option2=s.nextInt();

                        switch (option2)
                        {
                            case 1:
                                String option3="";
                                do
                                {
                                    System.out.println("\t\t Entry ");
                                    Customers customers=new Customers();
                                    customers.setCustomers();
                                    CustomerList.add(customers);
                                    System.out.println("do you want to add another bill ?(y/n):");
                                    option3=s.next();

                                }while(option3.equalsIgnoreCase("Y"));
                                break;
                            case 2:
                                System.out.println("\t\t View ");
                                for (Customers customers:CustomerList)
                                {
                                    customers.getCustomers();
                                    System.out.println("===============================================================");
                                }

                                break;
                            case 3:
                                System.out.println("Back to main menu");
                                break;
                            default:
                                System.out.println("Wrong option Selected try again ");
                                break;

                        }

                    }while(option2 !=3);
                break;
                case 3:
                    System.out.println("You are exited");
                    break;
                default:
                    System.out.println("Wrong option selected try again !!!");
                break;

            }


        }while (option!=3);

    }
}
