package sample.other;

import java.io.*;
import java.net.URL;
import java.util.*;

public class FileReaderEx {
    public static void main(String args[]) throws IOException {
         FileReader fileReader = new FileReader("./src/main/java/sample/other/sample.csv");
         BufferedReader buffReader = new BufferedReader(fileReader);
         String line;
        List<String> lines = new ArrayList<>();
        Map<String,String> map = new LinkedHashMap<>();
         while((line = buffReader.readLine()) != null){
             //System.out.println(line);
             /*if(!line.isEmpty() || !line.equals("")){
                 if(!lines.contains(line)){
                     lines.add(line);
                     String str = line.substring(0,line.indexOf(','));
                     if(map.containsKey(str)){
                         map.remove(str);
                     }
                     map.put(str,line);
                 }
             }*/

             if(!line.isEmpty() || !line.equals("")){
                 String str = line.substring(0,line.indexOf(','));
                 if(str.equals("ID")){
                     System.out.println(line);
                 }else{
                     if(map.containsKey(str)){
                         map.remove(str);
                     }
                     map.put(str,line);
                 }

             }


         }

         /*System.out.println("**************");
         for(String str : lines){
             System.out.println(str);
         }
*/
        System.out.println("#################");
        for(String str : map.values()){
            System.out.println(str);
        }

    }

}
