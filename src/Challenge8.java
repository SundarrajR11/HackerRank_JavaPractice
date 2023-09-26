import java.math.BigInteger;
import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i =1; i <=T ; i++) {

            try {

                long l = sc.nextLong();

                System.out.printf("%d can be fitted in:%n",l);

                if(l >= Byte.MIN_VALUE && l <= Byte.MAX_VALUE){

                    System.out.printf("* byte%n* short%n* int%n* long%n");

                }
                else if (l >= Short.MIN_VALUE && l <= Short.MAX_VALUE) {

                    System.out.printf("* short%n* int%n* long%n");

                }
                else if (l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE) {

                    System.out.printf("* int%n* long%n");
                }
                else {
                    System.out.printf("* long%n");
                }

            }
            catch ( Exception e){

                System.out.println(sc.next()+" can't be fitted anywhere.");

            }

        }
        sc.close();
    }
}
