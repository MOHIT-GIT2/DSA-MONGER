package recursion.String_Subset_questions;

public class removeCharacter {
    static void main() {
        String str="baccad";
        str=remove(str,0,"");
        System.out.println(str);
    }

    private static String remove(String str, int i,String unprocessed) {
        if (str.length()==i){
            return unprocessed;
        }
        if (str.charAt(i) != 'a') {
            unprocessed += str.charAt(i);
        }
        return remove(str, i+1, unprocessed);
    }
}
