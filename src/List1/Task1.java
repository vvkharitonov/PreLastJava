package List1;

import java.util.Arrays;

/**
 * Created by dsk21 on 8/21/2018.
 */
public class Task1 {

    public static void main(String[] args) {
        ModArray testArray = new ModArray();

        testArray.setList(Arrays.asList("a1", "a2", "a3", "a1"));

        testArray.includes("a1");

    }

}
