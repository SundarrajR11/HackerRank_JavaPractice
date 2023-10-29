import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double payment = sc.nextDouble();

        if(0<payment && payment<Math.pow(10,9)){


            NumberFormat us= NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat ind = new DecimalFormat("###,###.##");
//            Locale IN= new Locale("en","IN");
//            NumberFormat India= NumberFormat.getCurrencyInstance(IN);
            NumberFormat china= NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat France= NumberFormat.getCurrencyInstance(Locale.FRANCE);

            System.out.println("US: "+us.format(payment));
            System.out.println("India: Rs."+ind.format(payment));
            System.out.println("China: "+ china.format(payment));
            System.out.println("France: "+France.format(payment));

        }
        sc.close();
    }

}
