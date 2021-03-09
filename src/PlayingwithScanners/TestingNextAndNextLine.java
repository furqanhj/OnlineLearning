package PlayingwithScanners;

import java.util.Scanner;

public class TestingNextAndNextLine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        String[] str = new String[cases];
        for (int i = 0; i < cases; i++) {
            str[i] = sc.next();
            System.out.println(str[i]);
        }
    }
}
