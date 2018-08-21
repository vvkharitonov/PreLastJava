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
        Assert.assertEquals("a1",testArray.LastOrEmpty());
    }

    @Test
    public void lastOrEmptyEmpty() throws Exception {
        ModArray testZeroArray = new ModArray();
        Assert.assertEquals("empty",testZeroArray.LastOrEmpty());
    }




    @Test
    public void includes() throws Exception {
        Assert.assertEquals(2, testArray.includes("a1"));
    }

}