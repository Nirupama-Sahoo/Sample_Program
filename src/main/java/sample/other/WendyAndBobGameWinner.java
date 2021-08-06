package sample.other;

public class WendyAndBobGameWinner {
    public static String gameWinner(String colours){
        colours = colours + "$$";
        char[] array = colours.toCharArray();
        int countW = 0;
        int countB = 0;
        for(int i = 0; i < array.length ; i++){
            if(i == array.length){
                break;
            }
            if('w' == array[i]  && 'w' == array[i+1] && 'w' == array[i+2]){
                countW++;
            }
        }
        for(int i = 0; i < array.length ; i++){
            if(i == array.length){
                break;
            }
            if('b' == array[i]  && 'b' == array[i+1] && 'b' == array[i+2]){
                countB++;
            }
        }
        if(countW == countB){
            return "bob";
        }else if(countW > countB){
            return "wendy";
        }else{
            return "bob";
        }
    }
    public static void main(String args[]){
        String str = "wwwbbbbwwww";
        System.out.println(gameWinner(str));
    }
}
