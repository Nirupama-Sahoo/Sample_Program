package sample.string;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class PrefixCount {

    /*
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */

    static List<String> names = new ArrayList<String>();
    public static List<Integer> contacts(List<List<String>> queries) {

        List<Integer> counts = new ArrayList<Integer>();

        // Write your code here
        for (List<String> query : queries) {

            if (query.get(0).equals("add")) {
                names.add(query.get(1));
            }
            if (query.get(0).equals("find")) {
                int number = find(query.get(1));
                counts.add(number);
            }
        }
        for(int num : counts){
            System.out.println(num);
        }
        return counts;
    }

    public static int find(String prifix){
        int count = 0;
        for(String name : names){
                if(name.startsWith(prifix))
                    count ++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<String> str1 = new ArrayList<>();
        str1.add("add");
        str1.add("hack");
        List<String> str2 = new ArrayList<>();
        str2.add("add");
        str2.add("hackerrank");
        List<String> str3 = new ArrayList<>();
        str3.add("find");
        str3.add("hac");
        List<String> str4 = new ArrayList<>();
        str4.add("find");
        str4.add("hak");

        List<List<String>> queries = new ArrayList<>();
        queries.add(str1);
        queries.add(str2);
        queries.add(str3);
        queries.add(str4);
        List<Integer> result = PrefixCount.contacts(queries);
    }
}


