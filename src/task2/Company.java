package task2;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan","Pracowity",2001,12);
        Employee employee1 = new Employee("Zenek","Leniwy",2005,4);
        Employee employee2 = new Employee("Zosia","Nowa",2000,0.5);

        employee.show();
        employee1.show();
        employee2.show();

    }
}
