package List1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsk21 on 8/21/2018.
 */
public class ModArray {

    private List<String> list;

    public ModArray() {
        this.list=new ArrayList<String>();
    }

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


    public String FirstOrZero() {
        if (list.isEmpty()) {
            return ("0");
        } else return (list.get(0));
    }


    public String LastOrEmpty() {
        if (list.isEmpty()) {
            return ("empty");
        } else return (list.get(list.size()-1));
    }



    public void setList(List<String> list) {
        this.list = list;
    }
}

