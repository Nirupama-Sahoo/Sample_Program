package sample.other;

public class MaximumOccurringCharacter {
    public static char maximumOccurringCharacter(String text){
        int count[] = new int[256];
        char result = ' ';
        int length = text.length();
        for(int i = 0;i< length; i++){
            count[text.charAt(i)]++;
        }
        int max = -1;

        for(int i = 0; i < length; i++){
            if(max < count[text.charAt(i)]){
                max = count[text.charAt(i)];
                result = text.charAt(i);
            }
        }
        return result;
    }
    public static void main(){
        String str = "aabbdffyygggthfff";
        System.out.println(maximumOccurringCharacter(str));
    }
}
