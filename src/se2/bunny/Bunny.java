package se2.bunny;

import com.jogamp.opengl.GLAutoDrawable;

/**
 * スタンフォードうさぎのモデルそのものです。利用側は{@code draw}メソッドを呼び出すだけで描画できるようにします。
 * {@code TestEventListener}で言うところの{@code glut.glutWireTeapot(scale)}を、{@code bunny.draw(gl2)}に置き換えられるようにします。<I>つまり、法線ベクトルの計算はこのクラスの責任です。</I>
 * @author 担当者未定
 *
 */
public class Bunny extends SolidFigure{

	@Override
	public void draw(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		
	}

}
