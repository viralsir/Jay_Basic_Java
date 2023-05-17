/*
  array [size]=50
  is derived data type   int array

  Generic Class

  ArrayList  alist=ArrayList();
  object

  List
       ArrayList
       LinkedList
  Vector
  HasTable



 */
import java.util.*;
public class GenricDemo {
    public static void main(String[] args) {
//        ArrayList alist=new ArrayList();
//
//        alist.add(1);
//        alist.add("vimal");
//
//        System.out.println("first value :"+ alist.get(0).toString());
//        System.out.println("second value:"+alist.get(1));
//

        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter No:");
            arrayList.add(s.nextInt());
        }

        System.out.println("\n output :\n");
        for (int element:arrayList)
        {
            System.out.println(element);
        }

    }
}
