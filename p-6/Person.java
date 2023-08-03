public class Person {
    String name;
    int age;
    String job;
    float Salary;
    float taxes=(20f/100f);
    String city;

    static int population;
    public float salaryAfterTaxes(float salary) {
        return  Salary-(Salary *taxes);
    }

    Person()    {
        population++;

    }
    Person(String name,int age)    {
        population++;
        this.name=name;
        this.age=age;
    }

    public Person(String name, int age, String job, float salary, String city) {
        population++;
        this.name = name;
        this.age = age;
        this.job = job;
        this.Salary = salary;
        this.city = city;
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
