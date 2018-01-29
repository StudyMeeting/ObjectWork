package pokemon.work.pokemon04.polymorphism;


/**
 * ポケットモンスターを表現するインターフェース
 */
public interface PokemonIF {

/* メソッド：すべてのポケモンが持っているであろうふるまい(動き)を宣言します ------------ */
    /**
     * ポケモンの攻撃メソッド
     * @param pokemon Pokemon
     */
    public void attack(Pokemon pokemon);

    /**
     * ポケモンのアイテム利用メソッド
     */
    public void useItems();

    /**
     * ポケモンの逃げるメソッド
     */
    public void escape();

    /**
     * ステータスを表示するメソッド
     */
    public void showStatus();

}
