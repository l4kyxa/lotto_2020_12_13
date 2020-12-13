package lotto;
import java.io.FileWriter;
import java.io.IOException;
public class Write {
    public static int[] winnerNumbers (int[] winnerNumbers, String filename)
    {
        int[] Assistant = winnerNumbers;
        FileWriter writer = null;
        try
        {
            writer = new FileWriter(filename);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        for (int i = 0; i < Assistant.length; i++)
        {
            try
            {
                writer.append(Assistant[i] + ",");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        try
        {
            writer.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            writer.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return winnerNumbers;
    }

    public static int[] coupunNumbers(int Nnumber,int[] coupunNumbers, String filename)
    {
        FileWriter writer = null;
        try
        {
            writer = new FileWriter(filename);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        for (int t = 0; t < Nnumber; t++)
        {
            coupunNumbers = Generate.generate();
            for (int i = 0; i < coupunNumbers.length; i++)
            {
                try
                {
                    writer.append(coupunNumbers[i] + ",");
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
             try
             {
              writer.append('\n');
            }
             catch (IOException e)
             {
              e.printStackTrace();
             }
        }
        try
        {
            writer.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            writer.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return coupunNumbers;
    }

}
