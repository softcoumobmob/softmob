package se2.bunny;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

/**
 * BunnyEventListenerは{@code GLEventListener}インターフェースと{@code Controllable}インターフェースを両方実装する描画クラスです。前者を実装することでうさぎが表示できます。後者を実装することでマウスやキーボードでの操作があった時に表示を変えられます。
 * @author 担当者モブ
 *
 */
public class BunnyEventListener implements GLEventListener, Controllable{

	/**
	 * 描画する立体。
	 */
	private SolidFigure bunny;

	@Override
	public void display(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotate(float x, float y, float z) {
		// TODO Auto-generated method stub

	}

	@Override
	public void expand(float scale) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

}
