package recursion.String_Subset_questions;

import java.util.ArrayList;
import java.util.List;

public class String_Subset_abc {
    static void main() {
        String str="abc";
        subset("",str);
        System.out.println(list);
    }

    static List<String> list=new ArrayList<>();

    private static void subset(String unprocessed, String processed) {
        if (processed.isEmpty()){
            list.add(unprocessed);
            return;
        }
        subset(unprocessed,processed.substring(1));
        unprocessed+=processed.charAt(0);
        subset(unprocessed,processed.substring(1));
    }
}
