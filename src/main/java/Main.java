public class Main {
    public static void main(String[] args){
        try{
            Employee emp=new Employee("Bilbo Baggins");
            emp.PrintEmpoyee();
        }catch(FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        }
        try{
            Employee emp=new Employee("Bilbo Baggins from Shire");
            emp.PrintEmpoyee();
        }catch(FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        }
        try{
            Employee emp=new Employee("Frodo Baggins");
            emp.PrintEmpoyee();
        }catch(FieldLengthLimitException ex){
            System.out.println(ex.getMessage());
        }
    }
}