package practice;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class NumberBaseballGame {
    String answer;
    boolean playYn;
    Scanner scanner;

    public void play() {
        StringCalculator sc = new StringCalculator();
        scanner = new Scanner(System.in);
        playYn = true;
        getRandomNumber();
        int[] judgement = null;
        while (playYn) {
            System.out.print("숫자를 입력하세요:  ");
            String value = scanner.next();
            if (judge(pitching(value))) {
                switchPlayYn();
            }
        }
    }

    public void getRandomNumber() {
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("000");
        String result = df.format(random.nextInt(999));
        System.out.println(result);
        this.answer = result;
    }

    public int[] pitching(String input) {
        int ball = 0;
        int strike = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == this.answer.charAt(i)) {
                strike++;
            } else if (this.answer.contains(String.valueOf(input.charAt(i)))) {
                ball++;
            }
        }
        return new int[]{ball, strike};
    }

    public boolean judge(int[] input) {
        boolean result = false;
        System.out.println(input[0] + "볼 " + input[1] + "스트라이크");
        if (input[1] == 3) result = true;
        return result;
    }

    public void switchPlayYn() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String value = scanner.next();
        if ("1".equals(value)) {
            playYn = true;
            getRandomNumber();
        }
        if ("2".equals(value)) playYn = false;
    }
}
