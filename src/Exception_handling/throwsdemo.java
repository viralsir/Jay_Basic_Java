package Exception_handling;

import java.io.*;
/*
    unchecked exception

    checked exception

 */
public class throwsdemo
{
    public static void main(String[] args)throws IOException
    {

            BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Name :");
            String name=buffer.readLine();

            System.out.println("Name :"+name);





    }
}
