package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            input = scanner.nextLine();

            // r s p のいずれか？
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                break;
            } else {
                System.out.println("入力エラー。r, s, p のどれかを入力してください。");
            }
        }
        return input;
    }

    // 相手のじゃんけんの手を乱数で決める
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int)Math.floor(Math.random() * 3);
        return hands[index];
    }

    // 勝敗を判定して結果を出力する
    public void playGame(String myHand, String enemyHand) {

        // HashMapで r→グー などの対応
        HashMap<String, String> map = new HashMap<>();
        map.put("r", "グー");
        map.put("s", "チョキ");
        map.put("p", "パー");

        System.out.println("自分の手は" + map.get(myHand) + "、対戦相手の手は" + map.get(enemyHand));

        // 勝敗判定
        if (myHand.equals(enemyHand)) {
            System.out.println("あいこです");
        } else if (
            (myHand.equals("r") && enemyHand.equals("s")) ||
            (myHand.equals("s") && enemyHand.equals("p")) ||
            (myHand.equals("p") && enemyHand.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
