import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.java.Employee;



public class EmployeeTest {
    @Test
    public void testValidConstructor() {
        // TODO: Testez la creation d'un employe valide.
        Employee a = new Employee("toto",1, "oui");
        assertTrue(true);
    }
    @Test
    public void testInvalidConstructor() {
        // TODO: Testez les cas invalides (nom vide, id negatif, etc.).
    }

}
