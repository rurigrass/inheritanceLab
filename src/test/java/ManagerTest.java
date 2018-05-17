import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Katy", 12345678,40000.50,"Tech");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Tech", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.2);
        assertEquals(48000.60, manager.getSalary(), 0.1);
    }

    @Test
    public void cantLowerSalary(){
        manager.raiseSalary(-0.1);
        assertEquals(40000.50, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.01, manager.payBonus(), 0.1);
    }

}
