import org.junit.Test;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void createEmployeeTest() {
        String name = "Ryan";

        double salary = 1000;

        Employee testEmp = null;

        try{
            testEmp = new Employee(name, salary);
        } catch (IncorrectSalaryException e) {
            throw new RuntimeException(e);
        } catch (FieldLengthLimitException e) {
            throw new RuntimeException(e);
        }

        assertEquals(name, testEmp.getName());
        assertEquals(salary, testEmp.getSalary(), 0.00001);
    }

    @Test
    public void exceptionTestName(){
        String name = "Georgia";

        double salary = -4007;

        Exception thrown = assertThrows(IncorrectSalaryException.class, () -> new Employee(name, salary));
        System.out.println(thrown.getMessage());;
        assertTrue(thrown.getMessage().contains("Salary is negative"));
    }

    @Test
    public void exceptionTestSurname(){
        String name = "Billyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";

        double salary = 4007;

       Exception thrown = assertThrows(FieldLengthLimitException.class, () -> new Employee(name, salary));

        assertTrue(thrown.getMessage().contains("Too much sumbols in name!"));
    }

    @Test
    public void exceptionTestSalary(){
        String name = "Jonny";

        double salary = -1000;

        Exception thrown = assertThrows(IncorrectSalaryException.class, () -> new Employee(name, salary));

        assertTrue(thrown.getMessage().contains("Salary is negative"));
    }
}


