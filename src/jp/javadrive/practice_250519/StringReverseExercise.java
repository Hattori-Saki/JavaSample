package jp.javadrive.practice_250519;

public class StringReverseExercise {
    public static void main(String[] args) {
        //  元の文字列
        String original = " こんにちは、Java プログラミング";
       
        // TODO: StringBuilder を使って文字列を反転させる
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
       
        //  結果の出力
        System.out.println(" 元の文字列: " + original);
        System.out.println(" 反転した文字列: " + sb.toString());
       
        //  期待される出力:
        //  元の文字列:  こんにちは、Java プログラミング
        //  反転した文字列:  グンミラグロプavaJ 、はちにんこ
    }
}