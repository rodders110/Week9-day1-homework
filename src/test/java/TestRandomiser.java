import models.Randomiser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestRandomiser {

    Randomiser randomiser;


    @Before
    public void before(){
        randomiser = new Randomiser();
    }

    @Test
    public void hasArrayLst(){
        assertEquals(7, randomiser.getNames().size());
    }

    @Test
    public void canGetName(){
        String result = randomiser.getList(1);
        assertTrue(result.length() > 0);
    }

    @Test
    public void canGetTwoNames(){
        String result = randomiser.getList(2);
        assertTrue(result.length() > 0);
    }

    @Test
    public void CanGetThreeNames(){
        String result = randomiser.getList(3);
        assertTrue(result.length() > 0);
    }
}
