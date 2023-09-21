
public class Main {
    public static void main(String[] args){
        try{
            Employee emp=new Employee("Bilbo Baggins", 67.86);
            emp.PrintEmpoyee();
        }catch(FieldLengthLimitException ex){
            System.out.println("User exception" + ex.getMessage());
        }
        catch (IncorrectSalaryException ex){
            System.out.println("User exception" + ex.getMessage());
        }
        try{
            Employee emp=new Employee("Bilbo Baggins from Shire", 41.50);
            emp.PrintEmpoyee();
        } catch(FieldLengthLimitException ex){
            System.out.println("User exception" + ex.getMessage());
        }
        catch (IncorrectSalaryException ex){
            System.out.println("User exception" + ex.getMessage());
        }
        try{
            Employee emp=new Employee("Frodo Baggins", -21.50);
            emp.PrintEmpoyee();
        } catch(FieldLengthLimitException ex){
            System.out.println("User exception" + ex.getMessage());
        }
        catch (IncorrectSalaryException ex){
            System.out.println("User exception" + ex.getMessage());
        }
    }
}