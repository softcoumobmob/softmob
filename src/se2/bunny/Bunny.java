package se2.bunny;

import com.jogamp.opengl.GL2;
import java.util.ArrayList;

/**
 * スタンフォードうさぎのモデルそのものです。利用側は{@code draw}メソッドを呼び出すだけで描画できるようにします。
 * {@code TestEventListener}で言うところの{@code glut.glutWireTeapot(scale)}を、{@code bunny.draw(gl2)}に置き換えられるようにします。<I>つまり、シェーディングはこのクラス(ないしこのクラス以下)の責任です。</I>
 * たぶん面法線ベクトルは{@Code Face}クラスで定義するのがわかりやすいと思います。
 * @author 木村
 *
 */
public class Bunny extends SolidFigure{
	
    PLYSource ply;

	@Override
	public void draw(GL2 gl2) {
		// TODO Auto-generated method stu

	}
    
}
