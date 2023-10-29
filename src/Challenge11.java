import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(-100<=n && n<=100){
            String convert=Integer.toString(n);

            if(!convert.isEmpty() && convert!= null){
                System.out.println("Good job");
            }
            //n== Integer.parseInt(convert)
        }
        else{
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}
