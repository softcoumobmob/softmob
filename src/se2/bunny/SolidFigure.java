package se2.bunny;

import com.jogamp.opengl.GL2;

/**
 * 自身を{@code GLAutpDrawable}な描画領域に描画する能力を持った立体を示す抽象クラスです。
 * @author kawabata
 *
 */
public abstract class SolidFigure {
	/**
	 * 引数で渡された描画領域に対して自分自身を描画します。
	 * @param gl2 描画対象
	 */
	public abstract void draw(GL2 gl2);
}
