import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        if(0<=q && q<=500){
            for (int i = 0; i <q ; i++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(0<=a && a<=50 && 0<=b && b<=50) {
                    int n = sc.nextInt();
                    if (1 <= n && n<= 15){
                        int sum=0;

                        for(int j=0;j<n;j++){


                            if(j==0){
                                sum=sum+(a+(int)Math.pow(2,j)*b);
                            }
                            else{
                                sum=sum+(((int)Math.pow(2,j))*b);
                            }
                            System.out.print(sum+" ");

                            }
                        System.out.printf("%n");

                        }

                    }

                }
            }
        sc.close();
        }

    }
