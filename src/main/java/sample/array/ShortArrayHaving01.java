package sample.array;

public class ShortArrayHaving01 {
    public static void main(String args[]){
        int array[] = {0,1,0,1,0,1,1,0,0};
        int start = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] == 0) {
                array[start] = 0;
                if (i != start) {  // should not override same value with 1
                    array[i] = 1;
                }
                start++;
            }
        }
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
