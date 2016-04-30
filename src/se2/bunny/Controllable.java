package se2.bunny;

/**
 * {@code Controllable}インターフェースを実装するクラスは、コントローラから操作できることを保証します。
 * @author kawabata
 *
 */
public interface Controllable {
	/**
	 * 対象を現在の角度から回転させます。回転量は既に回転している量に加えられます。
	 * つまり、{@code rotate(1.0f, 0.0f, 0.0f)}を2回行うことは、{@code rotate(2.0f, 0.0f, 0.0f)}を1回行ったのと同じ結果になるべきです。
	 * @param x X軸についての回転量
	 * @param y Y軸についての回転量
	 * @param z Z軸についての回転量
	 */
	public void rotate(float x, float y, float z);
	/**
	 * 対象の拡大率を変更します。正の値を与えることで拡大し、負の値を与えることで縮小します。拡大率は実行時点の拡大率に加えられます。
	 * つまり、{@code expand(1.5f)}してから{@code expand(-1.0f)}することは、{@code expand(0.5f)}するのと同じ結果になるべきです。
	 * @param scale 拡大率
	 */
	public void expand(float scale);
	
	/**
	 * 対象の回転量、拡大率を最初に戻します。
	 */
	public void reset();
}
