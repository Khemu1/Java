package myPackage;

public class Person {
    String name;
    int age;
    String job;
    float Salary;
    float taxes=(20f/100f);
    String city;

    static int population;

    Person()    {
        population++;

    }
    Person(String name,int age)    {
        population++;
        this.name=name;
        this.age=age;
    }
     Person(String name, int age, String job, float salary, String city) {
        population++;
        this.name = name;
        this.age = age;
        this.job = job;
        this.Salary = salary;
        this.city = city;
    }
    Person(Person obj)  {
        population++;
        this.name = obj.name;
        this.age = obj.age;
        this.job = obj.job;
        this.Salary = obj.Salary;
        this.city = obj.city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public float salaryAfterTaxes() {
        return  Salary-(Salary *taxes);
    }
    public float getTaxes() {
        return taxes;
    }

    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static int getPopulation() {
        return population;
    }

    public static void setPopulation(int population) {
        Person.population = population;
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
    public boolean  equals(Person obj)  {
       return name.equals(obj.name) && age==obj.age && job.equals(obj.job) && city.equals(obj.city) && Salary==obj.Salary;
    }
    public static void main(String[] args) {
        Person obj1 = new Person("Ali Hassan",20,"dressamking",10000,"Man United");
        Person obj2 = new Person("Youmna Ramadan",19,"Programmer",20000,"Fayoum");
        Person obj3 = new Person("Mohanned Yasser",23,"Ai Engineer",35000,"Egypt");
        Person obj4 = new Person(obj1);
        obj4.printAllinf();
        obj4.setSalary(40000);
        System.out.println(obj4.salaryAfterTaxes());
    }
}
