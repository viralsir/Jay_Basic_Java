package sixth;
import lib.fourth;

public class seventhoption
{
    public static void main(String[] args) {
        fourth first=new fourth();
        //System.out.println("private int p :"+first.p);
        //System.out.println("procted int pr:"+first.pr);
        //System.out.println("default int d:"+first.d);
        System.out.println("private int p:"+first.getP());
        System.out.println("public int u :"+first.u);
    }
}


