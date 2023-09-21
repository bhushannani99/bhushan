package assignment;

public class CarLoan
{
    public static void main(String[] args)
    {
        double principal = Double.parseDouble(args[0]);
        double years = Double.parseDouble(args[1]);
        double rate = Double.parseDouble(args[2]);

        double r = (rate / 100) / 12;   // monthly interest rate
        double n = 12 * years;          // number of months

        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principal;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }
}
 19 changes: 19 additions & 0 deletions19  
FiveIntPerLine.java
@@ -0,0 +1,19 @@
package assignment;

public class FiveIntPerLine
{
    public static void main(String[] args)
    {
        int START = 1;
        int END   = 100;
        int PER_LINE = 5;
        for (int i = START; i <= END; i++)
        {
            System.out.print(i + " ");
            if ((i + 1) % PER_LINE == 0)
                System.out.println();
        }
        System.out.println();

    }
}
