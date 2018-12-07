package task2;

public class Employee {
    private String name;
    private String surname;
    private int dataOfBirth;
    private double seniority;

    public Employee(String name,String surname,int dataOfBirth,double seniority){
        this.name = name;
        this.surname = surname;
        this.dataOfBirth = dataOfBirth;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(int dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public double getSeniority() {
        return seniority;
    }

    public void setSeniority(double seniority) {
        this.seniority = seniority;
    }
    public void show(){
        System.out.println( name + " "+ surname + " ur." + dataOfBirth + " seniority - " + seniority);
    }
}
