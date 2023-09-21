import org.junit.Test;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class EmployeeTest {
    @Test
    public void createEmployeeTest() {
        String name = "Ryan";
        String surname = "Gosling";
        double salary = 1000;

        Employee testEmp = null;

        try{
            testEmp = new Employee(name, surname, salary);
        }
        catch (CorrectDataException ex){
            Logger.getLogger(EmployeeTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        assertEquals(name, testEmp.getName());
        assertEquals(surname, testEmp.getSurname());
        assertEquals(salary, testEmp.getSalary(), 0.00001);
    }

    @Test
    public void exceptionTestName(){
        String name = "Georgia";

        double salary = 4007;

        CorrectDataException thrown = assertThrows(CorrectDataException.class, () -> new Employee(name, salary));

        assertTrue(thrown.getMessage().contains("Too much sumbols in name!\n"));
    }

    @Test
    public void exceptionTestSurname(){
        String name = "Billy";

        double salary = 4007;

        CorrectDataException thrown = assertThrows(CorrectDataException.class, () -> new Employee(name, salary));

        assertTrue(thrown.getMessage().contains("Too much sumbols in surname!\n"));
    }

    @Test
    public void exceptionTestSalary(){
        String name = "Jonny";

        double salary = -1000;

        CorrectDataException thrown = assertThrows(CorrectDataException.class, () -> new Employee(name, salary));

        assertTrue(thrown.getMessage().contains("Salary cannot be negative!\n"));
    }
}


