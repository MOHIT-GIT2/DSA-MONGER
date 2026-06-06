package recursion.permutation;

public class formingNumberOnDiceAmazonKunalQuestion {
    static void main() {
        int number=4;
        int[] diceArr={1,2,3,4,5,6};
        formation("",number);
    }
    static void formation(String processed,int number){
        if(number==0){
            //return
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= 6 && i<=number; i++) {
            formation(processed+i,number-i);
        }
    }
}
