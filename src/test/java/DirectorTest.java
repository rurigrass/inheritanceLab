import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Ruairidh", 87654321, 0.1, "Management", 1000000);}


    @Test
    public void canGetDeptName(){
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.2);
        assertEquals(0.1, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.1, director.payBonus(), 0.1);
    }

    @Test
    public void canGetBudget(){
            assertEquals(1000000, director.getBudget(), 0.1);
        }





}
