package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    // 辞書として使う HashMap
    HashMap<String, String> dictionary = new HashMap<>();

    // コンストラクタ（辞書に10個の英単語を登録）
    public Dictionary_Chapter21() {
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 辞書を調べて意味を返すメソッド
    public void search(String word) {
        if (dictionary.containsKey(word)) {
            System.out.println(word + "の意味は" + dictionary.get(word));
        } else {
            System.out.println(word + "は辞書に存在しません");
        }
    }
}
