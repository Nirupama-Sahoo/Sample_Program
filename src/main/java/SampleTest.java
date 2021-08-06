import java.lang.reflect.Array;

public class SampleTest {
    public void printArray(int array[]){

        int count = 0;

        for(int i=0; i < array.length; i++){
            if (array[i] != 0){
                array[count++] = array[i];
            }
        }

        while (count < array.length)
            array[count++] = 0;

        for(int i = 0; i <array.length; i++){
             System.out.println(array[i]);
         }

    }

    public static void main(String args[]){
        int array[] = {1,9,8,4,0,0,2,7,0,6,0};
        SampleTest sampleTest = new SampleTest();
        sampleTest.printArray(array);
    }
}
