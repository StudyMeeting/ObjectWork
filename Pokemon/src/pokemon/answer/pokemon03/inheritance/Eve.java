package pokemon.answer.pokemon03.inheritance;

/**
 * イーブイクラス
 * Pokemon クラスを継承して、Eve を実現したクラス
 */
public class Eve extends Pokemon {

/* フィールド：必要に応じて、イーブイ特有のデータを宣言します - ---------------------- */
/* 今回は、イーブイ特有のデータは作成していないため、記載をしません ------------------- */

/* コンストラクタ：オブジェクトを生成する際に利用します ------------------------------ */
/* コンストラクタは、スーパークラスから継承されないので、定義が必要です ----------------- */
/* デフォルトコンストラクタを利用する際は、暗黙的に作成されます------------------------ */
    /**
     * 引数なしのコンストラクタ
     */
    public Eve() {
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
    public Eve(String name, PokemonType type, String item) {
        // スーパークラスのコンストラクタへ値を受け渡す
        super(name , type , item);
    }

    /**
     * 引数ありのコンストラクタ
     * 必須項目(名前、タイプ)のみのコンストラクタ
     * @param name 名前
     * @param type タイプ
     */
    public Eve(String name, PokemonType type) {
        // スーパークラスのコンストラクタへ値を受け渡す
        super(name , type);
    }

/* メソッド：イーブイ特有のふるまい(動き)を宣言します ----------------------------- */
    /**
     * ポケモンの攻撃メソッド
     * イーブイの場合、攻撃をすると相手のHPを 15 減少させる
     * @param pokemon 攻撃相手のポケモンオブジェクト
     */
/* オーバーライド : スーパークラスのメソッドにサブクラス特有の処理を再定義 ------------- */
    @Override
    public void attack(Pokemon pokemon) {
        // Eveクラスに name フィールドは宣言されていませんが、
        // 継承している Pokemon クラスのフィールドを super を付与して明示的にアクセスします
        // super.getName()   → 自分自身の名前
        // pokemon.getName() → 攻撃相手の名前
        System.out.println("----->　" + super.getName() + "が" + pokemon.getName() + "へ攻撃");

        // イーブイが攻撃すると、攻撃相手のHP が 15 減少
        int damegeHp = pokemon.getHp() - 15;
        // 減少したHPを 攻撃相手のポケモンオブジェクトへ格納
        pokemon.setHp(damegeHp);

        System.out.println(pokemon.getName() + "のHPが" + pokemon.getHp() + "になりました");
    }

    /**
     * ポケモンのアイテム利用メソッド
     * アイテムを所持している場合は、アイテム利用ができる
     * アイテムを所持していない場合は、利用できない
     */
/* オーバーライド : スーパークラスのメソッドにサブクラス特有の処理を再定義 ------------- */
    @Override
    public void useItems() {
        // アイテムを所持している場合の処理
        if (super.getItem() != null) {
            System.out.println("----->　" + super.getName() + "がアイテム利用");

            // イーブイがアイテムを使うと HP が 15 増加
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
     * ポケモンのアイテム利用メソッド
     * アイテムを所持している場合は、アイテム利用ができる
     * アイテムを所持していない場合は、利用できない
     * @param item 利用したいアイテム
     */
/* オーバーロード : 同じ名前のメソッドを引数の数を変えて定義する --------------------- */
    public void useItems(String item) {
        // アイテムを所持している場合の処理
        if (item != null) {
            System.out.println("----->　" + super.getName() + "がアイテム利用");

            // イーブイがアイテムを使うと HP が 15 増加
            int recoveryHp = super.getHp() + 15;
            // 増加したHPを自分自身のオブジェクトへ格納
            super.setHp(recoveryHp);

            System.out.println(super.getName() + "のHPが" + super.getHp() + "になりました");

        // アイテムを所持していない場合の処理
        } else {
            System.out.println("使用できるアイテムを持っていません");
        }
    }

/* サブクラスで、メソッドをオーバーライド(再定義)しなかった場合、---------------------- */
/* スーパークラスの処理が適用されます --------------------------------------------- */
/* この、Eveクラスでは、逃げる処理が実装されていないため、Eveは逃げることができません ---- */
//    /**
//     * ポケモンの逃げるメソッド
//     */
//    @Override
//    public void escape() {
//    }

}
