package pokemon.work.pokemon01.createclass;

import pokemon.PokemonType;

/**
 * ポケットモンスターを定義するクラス
 */
public class Pokemon {

/* フィールド：すべてのポケモンが持っているであろうデータを宣言します ----------------- */
//TODO String型の変数名 name のポケモンの名前フィールドを宣言してください
    /** ポケモンの名前 */


    /** ポケモンのタイプ */
    private PokemonType type;

//TODO int型の変数名 hp　デフォルト値を100 として、ポケモンのHP フィールドを宣言してください
    /** ポケモンのHP (デフォルト100) */


//TODO int型の変数名 mp　デフォルト値を100 として、ポケモンのMP フィールドを宣言してください
    /** ポケモンのMP (デフォルト100) */


//TODO String型の変数名 item のポケモンが持っているアイテム フィールドを宣言してください
    /** ポケモンが持っているアイテム : String型の変数名 item */


/* メソッド：すべてのポケモンが持っているであろうふるまい(動き)を宣言します ------------ */
    /**
     * ポケモンの攻撃メソッド
     * @param pokemon Pokemon
     */
    public void attack(Pokemon pokemon) {
        // Pokemonクラスを継承したクラスにて、特有な機能を追記します
        System.out.println("Pokemon.attack()");
    }

    /**
     * ポケモンのアイテム利用メソッド
     */
//TODO 引数なし・戻り値なしの userItems メソッドを定義してください






    /**
     * ポケモンの逃げるメソッド
     */
    public void escape() {
        // Pokemonクラスを継承したクラスにて、特有な機能を追記します
        System.out.println("Pokemon.escape()");
    }

    /**
     * ステータスを表示するメソッド
     */
    public void showStatus() {
//TODO 発生しているコンパイルエラーを解消してください
        System.out.println("------------------------------------");
        System.out.println(" 名　前 ：　" + this.name);
        System.out.println("タ イ プ：　" + this.type);
        System.out.println("　H　P　：　" + this.hp);
        System.out.println("　M　P　：　" + this.mp);
        System.out.println("アイテム：　" + this.item);
        System.out.println("------------------------------------");
    }

/* アクセッサメソッド：フィールドの値を格納/取得するメソッドでカプセル化を実現します ---- */
    /**
     * ポケモンの名前ゲッターメソッド
     * @return name
     */
//TODO 引数なし・戻り値がString型の getName メソッドを定義してください




    /**
     * ポケモンの名前セッターメソッド
     * @param name String
     */
//TODO String型の引数1つ・戻り値なしの setName メソッドを定義してください




    /**
     * ポケモンのTypeゲッターメソッド
     * @return type
     */
    public PokemonType getType() {
        return type;
    }

    /**
     * ポケモンのTypeセッターメソッド
     * @param type PokemonType
     */
    public void setType(PokemonType type) {
        this.type = type;
    }

    /**
     * ポケモンのHPゲッターメソッド
     * @return type
     */
    public int getHp() {
        return hp;
    }

    /**
     * ポケモンのTypeセッターメソッド
     * @param hp int
     */
   public void setHp(int hp) {
        this.hp = hp;
    }

     /**
     * ポケモンのMPゲッターメソッド
     * @return mp
     */
   public int getMp() {
        return mp;
    }

    /**
     * ポケモンのMPセッターメソッド
     * @param mp int
     */
    public void setMp(int mp) {
        this.mp = mp;
    }

    /**
     * ポケモンのItemゲッターメソッド
     * @return item
     */
    public String getItem() {
        return item;
    }

    /**
     * ポケモンのTypeセッターメソッド
     * @param item String
     */
    public void setItem(String item) {
        this.item = item;
    }

}
