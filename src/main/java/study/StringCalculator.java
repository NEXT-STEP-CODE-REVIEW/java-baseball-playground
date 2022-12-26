package study;

import java.util.Scanner;

public class StringCalculator {

    int calculate(int a, String strB, String strC) {
        int c = Integer.parseInt(strC);
        if ("+".equals(strB)) return a + c;
        if ("-".equals(strB)) return a - c;
        if ("*".equals(strB)) return a * c;
        if ("/".equals(strB)) return a / c;

        return c;
    }

    public boolean isExpresion(String input) {
        return input.matches("[^0-9]");
    }

    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values = value.split(" ");
        int tot = 0;
        String expression = "";
        for (String item : values) {
            if (sc.isExpresion(item)) {
                expression = item;
            }
            if (!sc.isExpresion(item)) {
                tot = sc.calculate(tot, expression, item);
            }
        }
        System.out.println(tot);

    }
}
