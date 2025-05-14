package jp.javadrive.practice_250514;

public class FillInTheBlanks {
    public static void main(String[] args) {
        //  自作クラスのインスタンス化
        Enemy goblin = new Enemy();
        
        //  文字列の生成
        String monsterName = "goblin";
        
        //  ラッパークラスの生成
        Integer damage = 12;
        
        //  警告消すために追記
        System.out.println(goblin + monsterName + damage);
    }
}
class Enemy {}