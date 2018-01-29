package pokemon.work.pokemon03.inheritance;

/**
 * ポケモンクラスの利用クラス
 */
public class PokemonMain {

    /**
     * Main メソッド
     * @param   args    String[]
     */
    public static void main(String[] args) {


        // ピカチュウクラスを利用して、インスタンス生成
        Pikachu pikaChu = new Pikachu("ピカチュウ", PokemonType.TYPE_ELECTRIC ,"ピカチュウのアイテム");
        // ピカチュウのステータス表示
        pikaChu.showStatus();
        // ピカチュウの逃げる処理
        pikaChu.escape();

//TODO イーブイクラスをインスタンス化


//TODO イーブイクラスのステータス表示


//TODO イーブイの逃げる処理
    }

}
