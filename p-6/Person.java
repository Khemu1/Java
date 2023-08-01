public class Person {
    String name;
    int age;
    String job;
    float Salary;
    float taxes=(20f/100f);
    String city;

    static int population;
    public void salaryAfterTaxes() { // must be put in the constructor to work automatically
        this.Salary = Salary-(Salary *taxes);
    }

    Person()    {
        population++;
        salaryAfterTaxes();
    }
    Person(String name,int age)    {
        population++;
        this.name=name;
        this.age=age;
        salaryAfterTaxes();
    }

    public Person(String name, int age, String job, float salary, String city) {
        population++;
        this.name = name;
        this.age = age;
        this.job = job;
        this.Salary = salary;
        this.city = city;
        salaryAfterTaxes();
    }

    public  void printMaininfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }
    public void printAllinf() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(job);
        System.out.println(city);
        System.out.println(Salary);
    }
}
