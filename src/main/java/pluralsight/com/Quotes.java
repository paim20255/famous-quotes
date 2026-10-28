package pluralsight.com;

import java.util.Scanner;

public class Quotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quotes = {"Never look back", "Just do it", "Less is more"};


        System.out.println("Pick a quote (select #1 - #2): ");
        int index = scanner.nextInt();


        System.out.println(quotes[index]);




    }
}
