package jp.javadrive.practice_250514;

public class Instantiate2 {
    public static void main(String[] args) {
    	class Game { }
        class Player { }
        class Item { }
        class Enemy { }
        //  ここに4 つのクラスをインスタンス化するコードを書いてください
        Game game = new Game();
        Player player = new Player();
        Item item = new Item();
        Enemy enemy = new Enemy();
        
        System.out.println(game);
        System.out.println(player);
        System.out.println(item);
        System.out.println(enemy);
        
    }
}
