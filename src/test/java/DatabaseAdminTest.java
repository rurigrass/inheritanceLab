import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;

    @Before
    public void before(){
        databaseadmin = new DatabaseAdmin("Yang",00000001,30000.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Yang", databaseadmin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(00000001, databaseadmin.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.50, databaseadmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseadmin.raiseSalary(0.2);
        assertEquals(36000.60, databaseadmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.01, databaseadmin.payBonus(), 0.1);
    }





}
