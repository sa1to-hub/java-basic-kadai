package kadai_028;

public class JyankenExec_Chapter28 {

    public static void main(String[] args) {

        Jyanken_Chapter28 j = new Jyanken_Chapter28();

        String my = j.getMyChoice();      // 自分の手
        String enemy = j.getRandom();     // 相手の手

        j.playGame(my, enemy);            // 結果表示
    }
}
