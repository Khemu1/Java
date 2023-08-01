 import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rec obj = new Rec();
        System.out.println("enter length and width");
        obj.length= in.nextFloat();
        obj.width=in.nextFloat();
        System.out.println(Rec.returnArea(obj.length,obj.width));
    }

}
