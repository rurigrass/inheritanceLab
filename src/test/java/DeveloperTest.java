import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Juan", 00000002, 20000.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Juan", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(00000002, developer.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000.50, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.2);
        assertEquals(24000.60, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200.01, developer.payBonus(), 0.1);
    }


}
