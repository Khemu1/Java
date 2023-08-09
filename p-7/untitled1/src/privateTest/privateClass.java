package privateTest;

public class privateClass {
    private int  x =10;
    private void hi()  {
        System.out.println("Hello Java");
    }
    public static void main(String[] args) {
        privateClass obj = new privateClass();
        System.out.println(obj.x);
        obj.hi();
    }
}
