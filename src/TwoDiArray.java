import java.util.Scanner;

/*
  two di array : array of array

  rollno={ { {},{},{} },{},{}}
 */
public class TwoDiArray
{
    public static void main(String[] args) {
//        int[][] no={ {23},{3,33,44},{344,56,77,88}};
//
//        //int[][][] no=new int[2][3][2]; // no={{{12,2},{2,34},3},{}}
//
//        System.out.println(no[2][3]);
        Scanner s=new Scanner(System.in);
        int[][] no=new int[2][3];

        for (int row = 0; row <2 ; row++)
        {
            for (int col = 0; col < 3; col++)
            {

                System.out.println("Enter No:");
                no[row][col]=s.nextInt();
            }
        }

        System.out.println("\n output :\n");
        for (int row = 0; row <2 ; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                System.out.print(no[row][col]+" ");
            }
            System.out.println("");;
        }


    }
}
