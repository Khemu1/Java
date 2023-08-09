import encapsulationTest.Student;

import java.util.*;

 class EncapTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student obj = new Student();
        obj.setName(in.nextLine());
        obj.setId(in.nextLine());
        obj.setNumber(in.nextInt());
        System.out.println(obj.getId());
        System.out.println(obj.getNumber());
        System.out.println(obj.getName());
    }
}