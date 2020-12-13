package __TEST__;

import java.io.IOException;


public class test
{
    public static void main(String[] args) throws IOException
    {
        int[] LottoNumbers = {1, 2, 3, 4, 5,};
        System.out.print("A heti lottószámok emelkedő számsorrendben: ");
        for (int j = 0; j < LottoNumbers.length; j++)
        {
            System.out.print("["+("\033[0;33m"));
            System.out.print(LottoNumbers[j]);
            System.out.print(("\033[0m")+"] ");

        }

            System.out.println();
            int allmany = 0;
            for (int t = 0; t < 6; t++)
            {
                int[] CouponNumberS = {t + 1, t + 2, t + 3, t + 4, t + 5};

                int Hits = 0;
                for (int i = 0; i < LottoNumbers.length; i++)
                {
                    for (int j = 0; j < CouponNumberS.length; j++)
                    {
                        if (LottoNumbers[i] == CouponNumberS[j])
                        {
                            Hits++;
                        }
                    }
                }
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

                System.out.print(t + 1 + ". szelvény: ");
                for (int i = 0; i < CouponNumberS.length; i++)
                {
                    System.out.print("["+("\033[0;33m"));
                    System.out.print(CouponNumberS[i]);
                    System.out.print(("\033[0m")+"] ");
                }

                System.out.print(" Találat: ");
                System.out.print("-"+("\033[0;33m"));
                System.out.print(Hits);
                System.out.print(("\033[0m")+"- ");
                System.out.print(" Nyereménye: ");
                System.out.print(("\033[0;33m"));
                System.out.print(many);
                System.out.print(("\033[0m")+". Ft. ");
                allmany = allmany + many;
                System.out.println();
            }
        System.out.println();
        System.out.print("A lottótársaság összesen: ");
        System.out.print(("\033[0;33m"));
        System.out.print(allmany);
        System.out.print(("\033[0m")+"");
        System.out.print(" Forintot fizet Önnek.");
        System.out.println();
        }
    }





