package sample.stream.demo1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String args[]){

        //Creating a list of Integer value
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Original list:   "+myList);

        //Obtain a stream to the array list
        Stream<Integer>  myStream = myList.stream();

        //Obtain the minimum and maximum value by use of min(), max(), isPresent and get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent())
            System.out.println("Minimum Value:  " + minVal.get());

        //must obtain a new stream because the previous call to min() is a terminal
        // operation that consumed the stream
        myStream = myList.stream();
        Optional<Integer> maxValue = myStream.max(Integer::compare);
        if(maxValue.isPresent())
            System.out.println("Maximum value :  " + maxValue.get());

        //Sort the stream by use of shorted
        Stream<Integer> sortedStream = myList.stream().sorted();

        //Display the shorted stream by use of for each
        System.out.print("Shorted Stream : ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        //Display only the odd value by use of filter
        Stream<Integer> oddValue = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Odd values : ");
        oddValue.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        //Display only the odd value that are grater than 5
        oddValue = myList.stream().sorted().filter((n) -> (n % 2) == 1)
                                            .filter((n) -> n > 5);
        System.out.print("Odd values greater than 5: ");
        oddValue.forEach((n) -> System.out.print(n + " "));
        System.out.println();

    }
}
