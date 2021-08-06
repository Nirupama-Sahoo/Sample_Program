package sample.schedule;

import sample.lambda.demo6.MyFun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ScheduleTest {
    public static void maxMeeting(List<Integer> startTime, List<Integer> endTime){
        ArrayList<Meetings> meet = new ArrayList<>();
        for(int i = 0; i < startTime.size(); i++)
            // Creating object of meeting
            // and adding in the list
            meet.add(new Meetings(startTime.get(i), endTime.get(i), i));

        for(Meetings meeting : meet ){
            System.out.println("[ "+meeting.start +"  "+ meeting.end +" ]");

        }
        // Initialising an arraylist for storing answer
        ArrayList<Integer> m = new ArrayList<>();
        int time_limit = 0;

        MyComparator mc = new MyComparator();
        // Sorting of meeting according to
        // their finish time.
        Collections.sort(meet, mc);

        System.out.println("After Sorting :");
        for(Meetings meeting : meet ){
            System.out.println("[ "+meeting.start +"  "+ meeting.end +" ]");

        }
        // Initially select first meeting.
        m.add(meet.get(0).pos);

        // time_limit to check whether new
        // meeting can be conducted or not.
        time_limit = meet.get(0).end;

        for(int i = 1; i < meet.size(); i++)
        {
            if (meet.get(i).start > time_limit)
            {

                // Add selected meeting to arraylist
                m.add(meet.get(i).pos);

                // Update time limit
                time_limit = meet.get(i).end;
            }
        }

        for(int i = 0; i < m.size(); i++)
            System.out.print(m.get(i)  + " ");

    }

    public static int getMaxParticipation(List<Integer> startTime, List<Integer> endTime){
        int count = 1;
        int time_limit = endTime.get(0);

        for(int i = 1; i < startTime.size(); i++){
            if(startTime.get(i) > time_limit){
                count++;
                time_limit = endTime.get(i);
            }

        }
        return count;
    }
    public static void main(String args[]){
        // Starting time
        List<Integer> s = Arrays.asList( 1, 3, 0, 5, 8, 5 );

        // Finish time
        List<Integer> f = Arrays.asList(2, 4, 6, 7, 9, 9 );
       // maxMeeting(s,f);
        System.out.println("Max participation : "+ getMaxParticipation(s,f));

    }
}
