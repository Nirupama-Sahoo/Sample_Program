package sample.string;

public class ReverseString {
    public String reverse(String str){
        if(str==null || str.length() <=1)
        {
           return str;
        }else{

           return reverse(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String args[]){
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("Nirupama"));
    }
}
