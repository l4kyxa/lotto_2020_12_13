package lotto;
import java.util.Scanner;
public class Request
{
    public static int request()
    {
        Scanner kb = new Scanner(System.in);
        int Nnumber;
        do
        {System.out.print("Kérem adja meg mennyi szelvényt szeretne játékba küldeni.: ");
            while(true)
                try
                {
                    Nnumber= Integer.parseInt(kb.nextLine());
                    break;
                }
                catch (NumberFormatException nfe)
                {
                    System.out.print("Kérem adja meg mennyi szelvényt szeretne játékba küldeni.: ");
                }
        }while(Nnumber<= 0);
        return Nnumber;
    }
}

