/*
Task
        In this challenge, you must read  integers from stdin and then print them to stdout.
        Each integer must be printed on a new line.

        Input Format

        There are  lines of input, and each line contains a single integer.

        Sample Input

        42
        100
        125

        Sample Output

        42
        100
        125
*/


import java.util.*;

public class Challenge2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int First = sc.nextInt();
        int Second = sc.nextInt();
        int Third = sc.nextInt();

        System.out.println(First);
        System.out.println(Second);
        System.out.println(Third);

        sc.close();

    }
}
