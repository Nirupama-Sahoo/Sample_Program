package sample.generics;

public class WildCardDemo {
    public static void main(String args[]){
        Integer nums[] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(nums);
        double avg1 = iob.average();
        System.out.println("Integer average  :"+avg1);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double avg2 = dob.average();
        System.out.println("Double average  :"+avg2);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
        Stats<Float> fob = new Stats<Float>(fnums);
        double avg3 = fob.average();
        System.out.println("Integer average  :"+avg3);

        System.out.print("Average of iob and dob");
        if(iob.sameAverage(dob)){
            System.out.println("are same");

        }else{
            System.out.println("different");
        }
        System.out.print("Average of iob and fob");
        if(iob.sameAverage(fob)){
            System.out.println("are same");
        }else{
            System.out.println("different");
        }
    }
}
