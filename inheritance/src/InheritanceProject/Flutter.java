package InheritanceProject;

public class Flutter extends Emploee {
    private boolean python;
    private boolean CSS;
    private boolean Dart;
    private boolean SQL;
    private boolean XML;
    private int projectNums;

    public Flutter(String name, int age, String address, String id, double salary, double taxes, String phoneNumber1, String phoneNumber2, String gmail, boolean python, boolean CSS, boolean dart, boolean SQL, boolean XML, int projectNums) {
        super(name, age, address, id, salary, taxes, phoneNumber1, phoneNumber2, gmail);

        this.python = python;
        this.CSS = CSS;
        Dart = dart;
        this.SQL = SQL;
        this.XML = XML;
        this.projectNums=projectNums;
    }
    public Flutter(Flutter FL) {
        super(FL.getName(), FL.getAge(), FL.getAddress(), FL.getId(), FL.getSalary(),
                FL.getTaxes(), FL.getPhoneNumber1(), FL.getPhoneNumber2(), FL.getEmail());
        this.python = FL.python;
        this.CSS = FL.CSS;
        this.Dart = FL.Dart;
        this.SQL = FL.SQL;
        this.XML = FL.XML;
        this.projectNums=FL.projectNums;
    }
    public Flutter(JavaDev copy) {
        super(copy.getName(), copy.getAge(), copy.getAddress(), copy.getId(), copy.getSalary(),
                copy.getTaxes(), copy.getPhoneNumber1(), copy.getPhoneNumber2(), copy.getEmail());
        this.name = copy.getName();
        this.setAge(copy.getAge());
        this.setAddress(copy.getAddress());
        this.setId(copy.getId());
        this.setSalary(copy.getSalary());
        this.setTaxes(copy.getTaxes());
        this.setPhoneNumber1(copy.getPhoneNumber1());
        this.setPhoneNumber2(copy.getPhoneNumber2());
        this.setEmail(copy.getEmail()) ;

    }


    public Flutter() {
        System.out.println("FL Default Constructor");
    }

    public boolean isPython() {
        return python;
    }

    public boolean isCSS() {
        return CSS;
    }

    public boolean isDart() {
        return Dart;
    }

    public boolean isSQL() {
        return SQL;
    }

    public boolean isXML() {
        return XML;
    }

    public int getProjectNums() {
        return projectNums;
    }

    public void setPython(boolean python) {
        this.python = python;
    }

    public void setCSS(boolean CSS) {
        this.CSS = CSS;
    }

    public void setDart(boolean dart) {
        Dart = dart;
    }

    public void setSQL(boolean SQL) {
        this.SQL = SQL;
    }

    public void setXML(boolean XML) {
        this.XML = XML;
    }

    public void setProjectNums(int projectNums) {
        this.projectNums = projectNums;
    }

    public void incressProjects ()  {
        this.projectNums++;
    }
    public void incressProjects (int n)  {
        this.projectNums=n + this.projectNums;
    }
    @Override
    public String toString() {
        return super.toString() +
                " Flutter {" +
                " python: " + this.python +
                ", CSS: "+ this.CSS +
                ", Dart: " + this.Dart +
                ", SQL: " + this.SQL +
                ", XML: " + this.XML +
                ", Number of Porjects: " + this.projectNums +
                '}'+ "\n";
    }
//    private boolean python;
//    private boolean CSS;
//    private boolean Dart;
//    private boolean SQL;
//    private boolean XML;
//    private int projectNums;
}
