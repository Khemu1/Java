package InheritanceProject;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Emploee
{
    protected String name;
    private int age;
    private String address;
    private String id;
    private double salary;
    private double taxes;
    private String phoneNumber1;
    private String phoneNumber2;
    private String email;
    static private   long CoumtEmp;
    private String regex= "(\\w|\\d)@(gmail|outlook|Yahoo)\\.(com$|net$)";
    private Pattern checkMail = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    public Emploee(String name, int age, String address, String id, double salary, double taxes, String phoneNumber1, String phoneNumber2, String gmail) {
        CoumtEmp++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
        this.salary = salary;
        this.taxes = taxes;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.email = gmail;
    }

    public Emploee(String name) {
        CoumtEmp++;
        this.name = name;
    }
    public Emploee()  {
        CoumtEmp++;
        System.out.println("Default constructor");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getTaxes() {
        return taxes;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public void setEmail(String email) {
        Matcher matcher = checkMail.matcher(email);
        if (matcher.find()) {
            this.email = email;
        } else {
            this.email=null;
        }
    }
    public double salaryAftertaxes ()   {
        return this.salary - taxes;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name= " + name + " " +
                ", age= " + age +
                ", address='" + address + " " +
                ", id= " + id + " " +
                ", salary= " + salary +" "+
                ", taxes=" + taxes +
                ", phoneNumber1= " + phoneNumber1 + " " +
                ", phoneNumber2= " + phoneNumber2 +" " +
                ", email='" + email + " " +
                '}' + "\n";
    }

}
