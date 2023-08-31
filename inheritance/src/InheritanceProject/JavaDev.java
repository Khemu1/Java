package InheritanceProject;

public class JavaDev extends Emploee {
    private boolean javaLevelOne;
    private boolean javaLevelTwo;
    private boolean javaLevelThree;
    private boolean javaGUI;
    private boolean oracleDatabase;
    static private long countJava;

    public JavaDev(String name, int age, String address, String id, double salary, double taxes, String phoneNumber1, String phoneNumber2, String gmail, boolean javaLevelOne, boolean javaLevelTwo, boolean javaLevelThree, boolean javaGUI, boolean oracleDatabase) {
        super(name, age, address, id, salary, taxes, phoneNumber1, phoneNumber2, gmail);
        countJava++;
        this.javaLevelOne = javaLevelOne;
        this.javaLevelTwo = javaLevelTwo;
        this.javaLevelThree = javaLevelThree;
        this.javaGUI = javaGUI;
        this.oracleDatabase = oracleDatabase;
    }

    public JavaDev(JavaDev JD) {
        super(JD.getName(), JD.getAge(), JD.getAddress(), JD.getId(), JD.getSalary(),
                JD.getTaxes(), JD.getPhoneNumber1(), JD.getPhoneNumber2(), JD.getEmail());
        countJava++;
        this.javaLevelOne = JD.javaLevelOne;
        this.javaLevelTwo = JD.javaLevelTwo;
        this.javaLevelThree = JD.javaLevelThree;
        this.javaGUI = JD.javaGUI;
        this.oracleDatabase = JD.oracleDatabase;
        this.name = JD.getName();
        this.setAge(JD.getAge());
        this.setAddress(JD.getAddress());
        this.setId(JD.getId());
        this.setSalary(JD.getSalary());
        this.setTaxes(JD.getTaxes());
        this.setPhoneNumber1(JD.getPhoneNumber1());
        this.setPhoneNumber2(JD.getPhoneNumber2());
        this.setEmail(JD.getEmail()) ;
    }


    public JavaDev() {
        countJava++;
        System.out.println("JD default Constructor");
    }

    public boolean isJavaLevelOne() {
        return javaLevelOne;
    }

    public boolean isJavaLevelTwo() {
        return javaLevelTwo;
    }

    public boolean isJavaLevelThree() {
        return javaLevelThree;
    }

    public boolean isJavaGUI() {
        return javaGUI;
    }

    public boolean isOracleDatabase() {
        return oracleDatabase;
    }

    public void setJavaLevelOne(boolean javaLevelOne) {
        this.javaLevelOne = javaLevelOne;
    }

    public void setJavaLevelTwo(boolean javaLevelTwo) {
        this.javaLevelTwo = javaLevelTwo;
    }

    public void setJavaLevelThree(boolean javaLevelThree) {
        this.javaLevelThree = javaLevelThree;
    }

    public void setJavaGUI(boolean javaGUI) {
        this.javaGUI = javaGUI;
    }

    public void setOracleDatabase(boolean oracleDatabase) {
        this.oracleDatabase = oracleDatabase;
    }

    @Override
    public String toString() {
        return super.toString()+
                " JavaDev {" +
                " Level-One: " + javaLevelOne +
                ", Level-Two: " + javaLevelTwo +
                ", Level-Three: " + javaLevelThree +
                ", Java-GUI: " + javaGUI +
                ", Oracle-Database: " + oracleDatabase +
                '}'+ "\n";
    }
}
