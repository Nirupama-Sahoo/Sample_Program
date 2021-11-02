package sample;

public class Sample {
    public static void main(String args[]){
        String str = "12,34,45,68,90,56,70";
        System.out.println(str);
        String array[] = str.split(",");
        for(int i =0 ; i< array.length; i++){
            System.out.print(Integer.parseInt(array[i]) +" ");
        }
    }
}
