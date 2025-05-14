package jp.javadrive.practice_250514;

import java.util.ArrayList;
public class TestInstance {
    public static void main(String[] args) {
        // 1. Player 型の変数にPlayer クラスのインスタンスを代入
		Player player = new Player();
        // 2. String  型の変数に文字列 "Java"  を代入
        String language = "Java";
        // 3. Integer  型の変数に数値 42  を代入
        Integer value = 42;
        // 4. ArrayList 型の変数に新しいArrayList を代入
        ArrayList<String> items = new ArrayList<>();
        //  出力して確認
        System.out.println(" プレイヤーを作成しました");
        System.out.println(" プレイヤー:" + player);  //  player未使用の警告出たので追記
        System.out.println(" 使用言語: " + language);
        System.out.println(" 値: " + value);
        System.out.println(" アイテム数: " + items.size());
    }
}
class Player {
    
}