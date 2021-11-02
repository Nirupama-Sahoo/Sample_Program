package sample.collection;

import java.util.ArrayList;
import java.util.List;

public class EmptyList {

     public void isEmpty(){
       List<String> listString = new ArrayList<>();
       System.out.println("Empty List :"+listString);

       if(listString.contains("ABB")){
           System.out.println("True");
       }else{
           System.out.println("False");
       }
     }
    public  static void main(String args[]){
        EmptyList newList = new EmptyList();
        newList.isEmpty();

    }
}
