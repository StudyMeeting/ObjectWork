package pokemon.answer.pokemon04.polymorphism;

/**
 * イーブイクラス
 * Pokemon クラスを継承して、Eve を実現したクラス
 */
public class Eve extends Pokemon {

/* フィールド：必要に応じて、イーブイ特有のデータを宣言します - ---------------------- */
/* 今回は、イーブイ特有のデータは作成していないため、記載をしません ------------------- */

/* メソッド：イーブイ特有のふるまい(動き)を宣言します ------------------------------ */
    /**
     * ポケモンの攻撃メソッド
     * イーブイの場合、攻撃をすると相手のHPを 15 減少させる
     * @param pokemon 攻撃相手のポケモンオブジェクト
     */
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
