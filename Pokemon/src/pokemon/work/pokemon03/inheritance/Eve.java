package pokemon.work.pokemon03.inheritance;

import pokemon.PokemonType;


/**
 * イーブイクラス
 * Pokemon クラスを継承して、Eve を実現したクラス
 */
// TODO Pokemon クラスを継承して、 Eve クラスを実装します
public class Eve XXXXXX Pokemon {

/* フィールド：必要に応じて、イーブイ特有のデータを宣言します - ---------------------- */
/* 今回は、イーブイ特有のデータは作成していないため、記載をしません ------------------- */

/* コンストラクタ：オブジェクトを生成する際に利用します ------------------------------ */
/* コンストラクタは、スーパークラスから継承されないので、定義が必要です ----------------- */
    /**
     * 引数なしのコンストラクタ
     */
//TODO 引数なしのコンストラクタを定義してください



    /**
     * 引数ありのコンストラクタ
     * すべてのフィールドを初期化
     * @param name 名前
     * @param type タイプ
     * @param item アイテム
     */
//TODO 引数3つのコンストラクタを定義してください
//TODO  - 第1引数 String型 変数 name
//TODO  - 第2引数 PokemonType型 変数 type
//TODO  - 第3引数 String型 変数 item






    /**
     * 引数ありのコンストラクタ
     * 必須項目(名前、タイプ)のみのコンストラクタ
     * @param name 名前
     * @param type タイプ
     */
//TODO 引数2つのコンストラクタを定義してください
//TODO  - 第1引数 String型 変数 name
//TODO  - 第2引数 PokemonType型 変数 type







/* メソッド：イーブイ特有のふるまい(動き)を宣言します ----------------------------- */
    /**
     * ポケモンの攻撃メソッド
     * イーブイの場合、攻撃をすると相手のHPを 15 減少させる
     * @param pokemon 攻撃相手のポケモンオブジェクト
     */
/* オーバーライド : スーパークラスのメソッドにサブクラス特有の処理を再定義 ------------- */
    @Override
    public void attack(Pokemon pokemon) {

        //TODO 適切なインスタンスから 名前を取得しましょう
        System.out.println("----->　" + XXXXX.getName() + "が" + XXXXX.getName() + "へ攻撃");

        // イーブイが攻撃すると、攻撃相手のHP が 15 減少
        int damegeHp = pokemon.getHp() - 15;
        // TODO 減少したHPを 攻撃相手のポケモンオブジェクトへ格納
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
//TODO 補足:userItemメソッドに関して、String型の引数 item を持つ、オーバーロードを実装します。
//    public void XXXXXXXX(XXXXXX XXXXX) {
//        // アイテムを所持している場合の処理
//        if (item != null) {
//            System.out.println("----->　" + super.getName() + "がアイテム利用");
//
//            // イーブイがアイテムを使うと HP が 15 増加
//            int recoveryHp = super.getHp() + 15;
//            // 増加したHPを自分自身のオブジェクトへ格納
//            super.setHp(recoveryHp);
//
//            System.out.println(super.getName() + "のHPが" + super.getHp() + "になりました");
//
//        // アイテムを所持していない場合の処理
//        } else {
//            System.out.println("使用できるアイテムを持っていません");
//        }
//    }

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
