package pokemon.work.pokemon01.createclass;

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

//TODO 作成して Pokemon クラスから、ピカチュウインスタンスを生成してください

//TODO ピカチュウインスタンスのsetNameメソッドを呼び出して、"ピカチュウ"と設定してください

//TODO ピカチュウインスタンスのsetTypeメソッドを呼び出して、PokemonType.TYPE_ELECTRIC と設定してください

//TODO ピカチュウインスタンスのshowStatusメソッドを呼び出して、ステータスを表示してください


        // 定義された Pokemon クラスから、イーブイインスタンスを生成
        Pokemon eve = new Pokemon();
        // 名前を設定
        eve.setName("イーブイ");
        // タイプを設定
        eve.setType(PokemonType.TYPE_NORMAL);
        // ステータスの表示
        eve.showStatus();

    }

}
