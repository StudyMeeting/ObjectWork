package pokemon.answer.pokemon02.constructor;

import pokemon.PokemonType;

/**
 * ポケモンクラスの利用クラス
 */
public class PokemonMain {

    /**
     * Main メソッド
     * @param   args    String[]
     */
    public static void main(String[] args) {

        // 定義された Pokemon クラスから、ピカチューインスタンスを生成
        System.out.println("1. デフォルトコンストラクタを利用 → インスタンスの作成のみ");
        Pokemon pikachu = new Pokemon();
        pikachu.showStatus();

        System.out.println("2. 引数2つのコンストラクタを利用 → 名前・タイプが設定済み");
        Pokemon eve = new Pokemon("イーブイ", PokemonType.TYPE_NORMAL);
        eve.showStatus();

        System.out.println("3. 引数3つのコンストラクタを利用 → 名前・タイプ・アイテムが設定済み");
        Pokemon meowth = new Pokemon("ニャース", PokemonType.TYPE_NORMAL ,"ニャースのアイテム");
        meowth.showStatus();

    }

}
