import java.util.Scanner;

/*
       while , for - exit loop
       dowhile - entry
       syntax :-
                 initialization of variable
                 do
                 {
                    statement;
                    true part;
                   increment or decrement of variable;
                  }while(condition);
 */
public class dowhiledemo {
    public static void main(String[] args) {
//        int i=1;
//        do
//        {
//            System.out.println(i);
//            i++;
//        }while(i<=10);
//

        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Start Number :");
//        int start=s.nextInt();
//        System.out.println("Enter Ending Number");
//        int end=s.nextInt();
//
//        do {
//            System.out.println(start);
//            start++;
//        }while (start<=end);

//         int i=1;
//         do {
//             int j=1;
//             do {
//                 System.out.print(j);
//                 j++;
//             }while(j<=i);
//             System.out.println("");
//             i++;
//         }while (i<=5);

          int i=1;
          do {
              boolean is_prime=true;
              int j=2;
              do {
                  if(i%j==0){
                      is_prime=false;
                      break;
                  }
                  j++;
              }while(j<i);
              if(is_prime)
              {
                  System.out.println(i);
              }
              i++;
          }while (i<=100);



    }
}
