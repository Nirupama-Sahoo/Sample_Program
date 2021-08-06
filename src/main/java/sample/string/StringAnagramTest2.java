package sample.string;

import java.util.*;

public class StringAnagramTest2 {
    public static List<List<String>> groupAnagram(String[] strs){
        List<List<String>>  result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String newStr = new String(array);

            if(map.containsKey(newStr)){
                map.get(newStr).add(str);
            }else{
                List<String> strings = new ArrayList<>();
                strings.add(str);
                map.put(newStr,strings);
            }
        }
        result.addAll(map.values());
        return result;
    }
    public static void main(String[] args) {
        String array[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> results = groupAnagram(array);
        results.forEach(t -> System.out.print(t + "   "));
    }
}
