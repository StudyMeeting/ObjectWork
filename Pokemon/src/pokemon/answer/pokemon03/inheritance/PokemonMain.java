package pokemon.answer.pokemon03.inheritance;

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
        // ステータスの表示
        pikaChu.showStatus();
        // 逃げる
        pikaChu.escape();
        

        // イーブイインスタンス生成
        Eve eve = new Eve();
        // 名前を設定
        eve.setName("イーブイ");
        // タイプを設定
        eve.setType(PokemonType.TYPE_NORMAL);
        // ステータスの表示
        eve.showStatus();
        // 逃げる
        eve.escape();

    }

}
