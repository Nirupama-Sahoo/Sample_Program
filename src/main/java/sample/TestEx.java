package sample;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestEx {
    public void getCount(int a[], int b[],int c[]){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < a.length; i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        for(int i = 0; i < b.length; i++){
            if(map.containsKey(b[i])){
                map.put(b[i],map.get(b[i])+1);
            }else{
                map.put(b[i],1);
            }
        }
        for(int i = 0; i < c.length; i++){
            if(map.containsKey(c[i])){
                map.put(c[i],map.get(c[i])+1);
            }else{
                map.put(c[i],1);
            }
        }

        Set<Map.Entry<Integer,Integer>> sets = map.entrySet();
        for(Map.Entry<Integer,Integer> set:sets){
            if(set.getValue() >= 2){
                System.out.println(set.getKey());
            }
        }

    }


    public static void main(String args[]){
        int a[] = {1,4,9,6,7,2};
        int b[] = {9,5,8,2,6};
        int c[] = {7,9,2,1,0,5};
        TestEx testEx = new TestEx();
        testEx.getCount(a,b,c);
    }
}
