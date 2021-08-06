package sample.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EfficientJanitor {
    static int  getMinTrips(List<Float> list, int n){
        int trips = 0;
        int left_index = 0;
        Collections.sort(list);
        for(Float value : list)
        System.out.println(value+ " ");
        for(int i = n-1; i>=0 ; i--){
            if(list.get(i) > 1.99){
                trips+=1;
            }else if(list.get(i) <= 1.99){
                if(list.get(i)+list.get(left_index) <= 3){
                    left_index+=1;
                }
                trips+=1;
            }if(left_index>=i){
                break;
            }
        }

       return trips;
    }
    public static void main(String args[]){
        List<Float> weight = new ArrayList<>();
        weight.add(1.01F);
        weight.add(1.99F);
        weight.add(2.5F);
        weight.add(1.5F);
        weight.add(1.01F);

        System.out.println(getMinTrips(weight,weight.size()));
    }
}
