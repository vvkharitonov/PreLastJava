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
    public void includes() throws Exception {
        Assert.assertEquals(2, testArray.includes("a1"));
    }

}