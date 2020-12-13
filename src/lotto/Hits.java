package lotto;

public class Hits
{
    public static int hits(int[] x, int[] y)
    {
        int Hits = 0;

        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < y.length; j++)
            {
                if (y[j] == x[i])
                {
                    Hits++;
                }
            }
        }
        return Hits;
    }

    public static int many(int Hits)
    {
        int many = 0;

        if (Hits == 2)
        {
            many = 1325;
        }
        if (Hits == 3)
        {
            many = 11400;
        }
        if (Hits == 4)
        {
            many = 780150;
        }
        if (Hits == 5)
        {
            many = 3365100;
        }
        return many;

    }
    public static int allmany(int many)
    {
        int allmany=0;
        allmany=allmany+many;
        return allmany;
    }
}
