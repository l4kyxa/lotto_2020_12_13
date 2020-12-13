package lotto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read
{
    public static int [] winnerNumbers (int [] winnerNumbers,String filename)
        {
            Scanner scanner = null;
            try
            {
                scanner = new Scanner(new File(filename));
            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            while (scanner.hasNext())
            {
                String Numbers = scanner.next();
                //System.out.print(Numbers);
                //System.out.print('\n');
            }
            scanner.close();
            return winnerNumbers;
        }

    public static int [] couponNumbers (int [] couponNumbers,String filename)
    {
        Scanner scanner = null;
        try
        {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        while (scanner.hasNext())
        {
            String Numbers = scanner.next();
           // System.out.print(Numbers);
          //  System.out.print('\n');
        }
        scanner.close();
        return couponNumbers;
    }
}






