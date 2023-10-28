import java.util.Scanner;

public class Challenge10 {
    private static Scanner sc = new Scanner(System.in);


     static int B = sc.nextInt();
     static int H = sc.nextInt();
    public static void main(String[] args) {

        if(-100<=B && B<=100 && -100<=H && H<=100){

            if(B>0 && H>0){
                System.out.println(B*H);
            }
            else {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }

        }

        }
    }


