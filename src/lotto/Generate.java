package lotto;

import java.util.Random;
public class Generate
{

    public static int[] generate()
    {
        Random rnd = new Random();
        int[] Numbers = new int[5];
        int NumberCounter = 0;
        while (NumberCounter < 5)
        {
            int Number = rnd.nextInt(90) + 1;
            boolean Included = false;
            for (int j = 0; j < NumberCounter; j++)
            {
                if (Numbers[j] == Number)
                {
                    Included = true;
                }
            }
            if (Included == false)
            {
                Numbers[NumberCounter] = Number;
                NumberCounter++;
            }
        }
        boolean Arranged = false;
        while (!Arranged) {
            Arranged = true;
            for (int j = 1; j < Numbers.length; j++)
            {
                if (Numbers[j - 1] > Numbers[j])
                {
                    int Assistant = Numbers[j - 1];
                    Numbers[j - 1] = Numbers[j];
                    Numbers[j] = Assistant;
                    Arranged = false;
                }
            }
        }
        return Numbers;
    }
}




