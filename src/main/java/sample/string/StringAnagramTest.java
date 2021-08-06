package sample.string;

import java.util.Arrays;
import java.util.List;

public class StringAnagramTest {

    public boolean stringAnagram(String str1, String str2){
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean result = Arrays.equals(chars1,chars2);
        return result;
    }
    public void testAnagram(List<String> strs){
        for(int i = 0; i < strs.size()-1; i++){
            for(int j = i+1; j <= strs.size()-1; j++){
                if(stringAnagram(strs.get(i), strs.get(j)))
                    System.out.println(strs.get(i)+ " and "+strs.get(j) + " are Anagram");
            }
        }

    }
    public static void main(String srgs[]){
        StringAnagramTest stringAnagramTest = new StringAnagramTest();
        List<String> strings = Arrays.asList("cat", "god", "act", "dog");
        stringAnagramTest.testAnagram(strings);
    }

}
