import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        String line=null;
        int i =1;

        while (sc.hasNext()){

            line=sc.nextLine();

            System.out.println(i+" "+line);
            i++;



        }

    }

}
