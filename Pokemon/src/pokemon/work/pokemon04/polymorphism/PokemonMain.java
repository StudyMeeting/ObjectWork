package pokemon.work.pokemon04.polymorphism;

/**
 * ポケモンクラスの利用クラス
 */
public class PokemonMain {

    /**
     * Main メソッド
     * @param   args    String[]
     */
    public static void main(String[] args) {


        // ピカチュウインスタンス生成
        Pikachu pikaChu = new Pikachu("ピカチュウ", PokemonType.TYPE_ELECTRIC ,"ピカチュウのアイテム");
        // 名前を設定
        pikaChu.setName("ピカチュウ");
        // タイプを設定
        pikaChu.setType(PokemonType.TYPE_ELECTRIC);
        // ステータスの表示
        pikaChu.showStatus();

        // イーブイインスタンス
        Eve eve = new Eve();
        // 名前を設定
        eve.setName("イーブイ");
        // タイプを設定
        eve.setType(PokemonType.TYPE_NORMAL);
        // ステータスの表示
        eve.showStatus();

        //ピカチュウからイーブイへの攻撃
        pikaChu.attack(eve);
        // ステータスの表示
        eve.showStatus();

        //イーブイへアイテムを渡す(オーバーライド)
        eve.setItem("オーバーライド");
        //イーブイがアイテムを利用
        eve.useItems();
        // ステータスの表示
        eve.showStatus();

        //イーブイがアイテムを利用(オーバーロード)
        eve.useItems("オーバーロード");
        // ステータスの表示
        eve.showStatus();

        // ピカチュウが逃げる
        pikaChu.escape();
        // イーブイが逃げる
        eve.escape();

        // 演習問題として、ニャースクラスを作成して、クラス呼び出しの記述を記載
        Meowth meowth = new Meowth("ニャース", PokemonType.TYPE_NORMAL, "ニャースのアイテム");

    }

}
