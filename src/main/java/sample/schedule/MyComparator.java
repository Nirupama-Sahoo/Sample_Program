package sample.schedule;

import java.util.Comparator;

public class MyComparator implements Comparator<Meetings> {
    @Override
    public int compare(Meetings o1, Meetings o2)
    {
        if (o1.end < o2.end)
        {

            // Return -1 if second object is
            // bigger then first
            return -1;
        }
        else if (o1.end > o2.end)

            // Return 1 if second object is
            // smaller then first
            return 1;

        return 0;
    }
}
