package jp.javadrive.practice_250519;

public class StringBuilderExercise {
    public static void main(String[] args) {
        //  複数の単語
        String[] words = {"Java", "は", "楽しい", "プログラミング", "言語", "です"};
       
        // TODO: StringBuilder を使って単語を結合する（スペースを入れて）
        StringBuilder sb = new StringBuilder();
       
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        
        System.out.println(" 結合後: " + sb.toString());
        
        // TODO: " 楽しい" を" 面白い" に置換する
        //  「楽しい」の開始位置を検索
        int startPos = sb.indexOf(" 楽しい");
        //  「楽しい」を「面白い」に置換
        sb.replace(startPos, startPos + " 楽しい".length(), " 面白い");
       
        System.out.println(" 置換後: " + sb.toString());
       
        //  期待される出力:
        //  結合後: Java は 楽しい プログラミング 言語 です
        //  置換後: Java は 面白い プログラミング 言語 です
    }
}
