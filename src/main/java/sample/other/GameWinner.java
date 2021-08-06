package sample.other;

public class GameWinner {
    // Function to return find winner of game
    static String Winner(int n, String []pile) {

        int a = 0, b = 0;

        for (int i = 0; i < n; ++i)
        {
            int l = pile[i].length();

            // Piles begins and ends with White box 'W'
            if (pile[i].charAt(0) == pile[i].charAt(l - 1) &&
                    pile[i].charAt(0) == 'W')
                a++;

            // Piles begins and ends with Black box 'B'
            if (pile[i].charAt(0) == pile[i].charAt(l - 1) &&
                    pile[i].charAt(0) == 'B')
                b++;
        }
        if (a <= b)
            return "A";
        else
            return "B";

    }
    public static void main(String[] args)
    {
        int n = 1;
        String pile[] = { "WWBWBW"};

        // function to print required answer
        System.out.println(Winner(n, pile));
    }
}

