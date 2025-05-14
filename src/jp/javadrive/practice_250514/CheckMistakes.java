package jp.javadrive.practice_250514;

public class CheckMistakes {
    public static void main(String[] args) {
        Monster monster = new Monster();  //newを追記
        String name = new String(" スライム");
        Integer hp = 100;  //newを削除
        System.out.println(monster + name + hp);
    }
}
class Monster {
	
}