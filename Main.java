import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //wywołanie metody
        System.out.println(getMyName());
        System.out.println(getMyAge());
        obliczenia(1,2);
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Podaj a i b: ");
        a = in.nextInt();
        b = in.nextInt();
        obliczenia(a,b);
        System.out.println(Math.pow(2.0,3.0));







    }
    //metody
    public static String getMyName(){
        return "Jan";
    }
    public static int getMyAge(){
        return 23;
    }
    public static void obliczenia(int l1, int l2){
        System.out.println(l1+" + "+l2+ " = "+(l1+l2));
        System.out.println(l1+" - "+l2+ " = "+(l1-l2));
        System.out.println(l1+" * "+l2+ " = "+(l1*l2));



    }


}