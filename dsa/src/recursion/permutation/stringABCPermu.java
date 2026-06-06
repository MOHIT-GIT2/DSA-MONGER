package recursion.permutation;

public class stringABCPermu {
    static void main() {
        String str="abc";
        permu("",str);
    }

    private static void permu(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first=processed.substring(0,i);
            String second=processed.substring(i);
            permu(first+ch+second,unprocessed.substring(1));
        }
    }
}
