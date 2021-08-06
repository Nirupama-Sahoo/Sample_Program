package sample.lambda.demo6;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFun<T> f,T v){
        int counter=0;

        for(int i =0; i< vals.length; i++)
            if(f.func(vals[i],v))
                counter++;
        return counter;
    }
    public static void main(String argss[]){
        int count;

        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82),
                                   new HighTemp(90), new HighTemp(89),
                                   new HighTemp(89), new HighTemp(91),
                                   new HighTemp(84), new HighTemp(83)
                                 };
        count = counter(weekDayHighs,HighTemp::sameTemp,new HighTemp(89));
        System.out.println(count+ " days had a high of 89");

        HighTemp[] weekDayHighs2 = {new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(1), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)
        };

        count = counter(weekDayHighs2, HighTemp::sameTemp,new HighTemp(12));
        System.out.println(count + " days had a high of 12 ");

        count = counter(weekDayHighs2, HighTemp::lessThanTemp,new HighTemp(19));

        System.out.println(count+ " days had high of less than 19");

    }
}
