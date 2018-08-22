package List1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by dsk21 on 8/21/2018.
 */
public class ModArrayTest {
    ModArray testArray;

    @Test
    public void findElementTrue() throws Exception {
        Assert.assertEquals("a3",testArray.findElement("a3"));
    }


    @Test
    public void findElementFalse() throws Exception {
        Assert.assertEquals("Error",testArray.findElement("a32"));
    }

@Before
    public void Preset()
    {
        testArray = new ModArray();
        testArray.setList(Arrays.asList("a1", "a2", "a3", "a1"));
    }


    @Test
    public void firstOrZeroFirst() throws Exception {
    Assert.assertEquals("a1",testArray.FirstOrZero());
    }

    @Test
    public void firstOrZeroZero() throws Exception {
        ModArray testZeroArray = new ModArray();
        Assert.assertEquals("0",testZeroArray.FirstOrZero());
    }


    @Test
    public void lastOrEmptyLast() throws Exception {
        Assert.assertEquals("a1",testArray.lastOrEmpty());
    }

    @Test
    public void lastOrEmptyEmpty() throws Exception {
        ModArray testZeroArray = new ModArray();
        Assert.assertEquals("empty",testZeroArray.lastOrEmpty());
    }




    @Test
    public void includes() throws Exception {
        Assert.assertEquals(2, testArray.includes("a1"));
    }

}