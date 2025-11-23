package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		 // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dict = new Dictionary_Chapter21();

        // 調べる英単語を配列にセット
        String[] words = { "apple", "banana", "grape", "orange" };

        // 1つずつ辞書で調べて表示
        for (int i = 0; i < words.length; i++) {
            dict.search(words[i]);
        }
    }

}
