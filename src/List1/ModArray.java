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

        count = (int) list.stream()
                .peek(System.out::println)
                .filter(s -> s.equals(testString))
                .peek(System.out::println)
                .count();
//        for (String  num:list
//             ) {
//            if (testString.equals(num)) {
//                count++;
//            }
//            System.out.println(num + " " + count);
//        }

        return count;

        
    }


    public String FirstOrZero() {
//        if (list.isEmpty()) {
//            return ("0");
//        } else return (list.get(0));

        return list.stream().findFirst().orElse("0");

    }


    public String lastOrEmpty() {
        if (list.isEmpty()) {
            return ("empty");
        } else return (list.get(list.size()-1));
//        return list.stream().skip(list.size()-1).findFirst().orElse("empty");
    }


    public String findElement (String testString)
    {
        return list.stream().filter(s -> s.equals(testString)).findAny().orElse("Error");
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}

