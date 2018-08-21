package List1;

import java.util.List;

/**
 * Created by dsk21 on 8/21/2018.
 */
public class ModArray {

    private List<String> list;

    public int includes(String testString)
    {
        int count=0;
        for (String  num:list
             ) {
            if (testString.equals(num)) {
                count++;
            }
            System.out.println(num + " " + count);
        }

        return count;

        
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}

