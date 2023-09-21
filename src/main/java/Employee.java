public class Employee {
    private int id;
    private static int nextid=0;
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id=nextid++;
        if(name.length()>15){throw new FieldLengthLimitException("Too much sumbols in name!");}
        if(salary < 0) {
            throw new IncorrectSalaryException("Salary is negative");
        }
        else {this.name = name; this.salary = salary; }
    }
    void PrintEmpoyee(){
        System.out.println("ID:"+id+" Name"+name + " Salary "+salary);
    }
}