package pokemon.answer.pokemon01.createclass;

import pokemon.PokemonType;

/**
 * ポケットモンスターを定義するクラス
 */
public class Pokemon {

/* フィールド：すべてのポケモンが持っているであろうデータを宣言します ----------------- */
    /** ポケモンの名前 */
    private String name;    // フィールドは宣言しなかった場合、デフォルト値が代入されます

    /** ポケモンのタイプ */
    private PokemonType type;

    /** ポケモンのHP (デフォルト100) */
    private int hp = 100;

    /** ポケモンのMP (デフォルト100) */
    private int mp = 100;

    /** ポケモンが持っているアイテム*/
    private String item;

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
    public void useItems() {
        // Pokemonクラスを継承したクラスにて、特有な機能を追記します
        System.out.println("Pokemon.useItems()");
    }

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
    public String getName() {
        return name;
    }

    /**
     * ポケモンの名前セッターメソッド
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

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
