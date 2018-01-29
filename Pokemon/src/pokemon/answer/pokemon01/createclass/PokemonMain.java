package pokemon.answer.pokemon01.createclass;

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
        Pokemon pikachu = new Pokemon();
        // 名前を設定
        pikachu.setName("ピカチュウ");
        // タイプを設定
        pikachu.setType(PokemonType.TYPE_ELECTRIC);
        // ステータスの表示
        pikachu.showStatus();

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
