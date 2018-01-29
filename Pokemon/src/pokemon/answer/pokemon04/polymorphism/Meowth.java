package pokemon.answer.pokemon04.polymorphism;

/**
 * ニャースクラス
 * Pokemon クラスを継承して、Meowth を実現したクラス
 * 演習問題用として、ピカチュークラスを参考に作成する
 */
public class Meowth extends Pokemon {

/* フィールド：必要に応じて、ニャース特有のデータを宣言します ----------------------- */
/* 今回は、ニャース特有のデータは作成していないため、記載をしません ------------------ */

/* コンストラクタ：オブジェクトを生成する際に利用します ------------------------------ */
/* コンストラクタは、スーパークラスから継承されないので、定義が必要です ----------------- */
    /**
     * 引数なしのコンストラクタ
     */
    public Meowth() {
        // スーパークラスのコンストラクタへ値を受け渡す
        super();
    }

    /**
     * 引数ありのコンストラクタ
     * すべてのフィールドを初期化
     * @param name 名前
     * @param type タイプ
     * @param item アイテム
     */
    public Meowth(String name, PokemonType type, String item) {
        // スーパークラスのコンストラクタへ値を受け渡す
        super(name , type , item);
    }

    /**
     * 引数ありのコンストラクタ
     * 必須項目(名前、タイプ)のみのコンストラクタ
     * @param name 名前
     * @param type タイプ
     */
    public Meowth(String name, PokemonType type) {
        // スーパークラスのコンストラクタへ値を受け渡す
        super(name , type);
    }

    /* メソッド：ニャース特有のふるまい(動き)を宣言します ----------------------------- */
    /**
     * ポケモンの攻撃メソッド
     * ニャースの場合、攻撃をすると相手のHPを 10 減少させる
     * @param pokemon 攻撃相手のポケモンオブジェクト
     */
    @Override
    public void attack(Pokemon pokemon) {
        // Pikachuクラスに name フィールドは宣言されていませんが、
        // 継承している Pokemon クラスのフィールドを super を付与して明示的にアクセスします
        System.out.println("----->　" + super.getName() + "が" + pokemon.getName() + "へ攻撃");

        // ニャースが攻撃すると、攻撃相手のHP が 12 減少
        int damegeHp = pokemon.getHp() - 12;
        // 減少したHPを攻撃相手のポケモンオブジェクトへ格納
        pokemon.setHp(damegeHp);

        System.out.println(pokemon.getName() + "のHPが" + pokemon.getHp() + "になりました");
    }

    /**
     * ポケモンのアイテム利用メソッド
     * アイテムを所持している場合は、アイテム利用ができる
     * アイテムを所持していない場合は、利用できない
     */
    @Override
    public void useItems() {
        // アイテムを所持している場合の処理
        if (super.getItem() != null) {
            System.out.println("----->　" + super.getName() + "がアイテム利用");

            // ニャースがアイテムを使うと HP が 15 増加
                int recoveryHp = super.getHp() + 15;
            // 増加したHPを自分自身のオブジェクトへ格納
            super.setHp(recoveryHp);

            System.out.println(super.getName() + "のHPが" + super.getHp() + "になりました");

        // アイテムを所持していない場合の処理
        } else {
            System.out.println("使用できるアイテムを持っていません");
        }
    }

    /**
     * ポケモンの逃げるメソッド
     */
    @Override
    public void escape() {
        System.out.println(super.getName() + "は逃げた");
    }

}
