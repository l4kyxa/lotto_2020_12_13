package lotto;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {

        //Bekérés
        int Nnumber = Request.request();
        System.out.println();

        //Szelvényszámok
            int[] coupunNumbers = Generate.generate();
            Write.coupunNumbers(Nnumber,coupunNumbers, "coupunsnumbers.csv");
            int[] y = Read.couponNumbers(coupunNumbers, "coupunsnumbers.csv");

        //Nyerőszámok
             int[] winnerNumbers = Generate.generate();
             Write.winnerNumbers(winnerNumbers,"winnernumbers.csv");
             System.out.print("A heti lottószámok emelkedő számsorrendben: ");
        int[] winner=Read.winnerNumbers(winnerNumbers,"winnernumbers.csv");
        for (int j = 0; j <winner.length; j++) {
            System.out.print("["+("\033[0;33m"));
            System.out.print(winner[j]);
            System.out.print(("\033[0m")+"] ");
        }
             System.out.println();

        System.out.println("\nAz Ön szelvényein található számok:");
        int AllMany =0;
        for (int i = 0; i < Nnumber; i++)

        {
            System.out.print(i+1);
            System.out.print(". szelvény: ");
            for (int j = 0; j <y.length; j++)
            {
                System.out.print("["+("\033[0;33m"));
                System.out.print(y[j]);
                System.out.print(("\033[0m")+"] ");
            }
            System.out.print(" Találat: ");
            System.out.print("-"+("\033[0;33m"));
            System.out.print(Hits.hits(winnerNumbers,coupunNumbers));
            System.out.print(("\033[0m")+"-");
            System.out.print("");
            System.out.print(" Nyereménye:");
            System.out.print(" "+("\033[0;33m"));
            System.out.print(Hits.many((Hits.hits(winnerNumbers,coupunNumbers))));
            System.out.print(("\033[0m")+".");
            System.out.print(" -Ft.");
            System.out.println();
            AllMany = Hits.allmany((Hits.hits(winnerNumbers,coupunNumbers)));
        }
        System.out.println();
        System.out.print("A lottótársaság összesen: ");
        System.out.print(("\033[0;33m"));
        System.out.print(AllMany);
        System.out.print(("\033[0m")+"");
        System.out.print(" Forintot fizet Önnek.");
        System.out.println();
    }
}

