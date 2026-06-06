package retry;

public class combinationsStringABC {
    static void main() {
        String str="abc";
        combination("",str);

    }
    public static void combination(String processed,String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first=processed.substring(0,i);
            String second=processed.substring(i);
            combination(first+ch+second,unprocessed.substring(1));
        }
    }
}
