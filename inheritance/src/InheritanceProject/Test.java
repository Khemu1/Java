package InheritanceProject;

public class Test {

    public static void main(String[] args) {
        Emploee emp = new Emploee("John Doe", 30, "123 Main St", "EMP001",
                50000.0, 2000.0, "123-456-7890", "987-654-3210", "john@example.com");
        System.out.println(emp);
        System.out.println(emp.salaryAftertaxes());

        // Create a JavaDeveloper
        JavaDev javaDev = new JavaDev("Alice Smith", 25, "456 Elm St", "JD001",
                60000.0, 6000.0, "111-222-3333", "444-555-6666", "alice@example.com",
                true, false, true, false, true);

        System.out.println(javaDev);

        Flutter flutterDev = new Flutter(javaDev);
        flutterDev.incressProjects(2); // Increase project count
        System.out.println(flutterDev);


        }
    }
