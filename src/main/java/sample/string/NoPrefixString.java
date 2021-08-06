package sample.string;

import java.util.ArrayList;
import java.util.List;

public class NoPrefixString {
    public static void noPrefix(List<String> words) {
        // Write your code here
        int position = 0;
        for(int i = 0 ; i < words.size(); i++){
            for(int j =i+1; j< words.size(); j++){
                if(words.get(j).startsWith(words.get(i))){

                       position = j;

                }
            }
        }
    System.out.println("BAD STRING :"+words.get(position));
    }

    public static void main(String args[]){
        List<String> strList = new ArrayList<>();
        strList.add("aab");
        strList.add("aac");
        strList.add("aacghgh");
        strList.add("aabghgh");

        noPrefix(strList);
    }
}
