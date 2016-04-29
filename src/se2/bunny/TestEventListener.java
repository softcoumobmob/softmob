package se2.bunny;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.util.gl2.GLUT;

/**
 * 個人的なテストクラスです。''本番では一切使いません。''
 * @author kawabata
 *
 */
public class TestEventListener implements GLEventListener, Controllable{
	
	private GL2 gl2;
	private GLUT glut;
	
	private float angleX = 0.0f;
	@Override
	public void display(GLAutoDrawable drawable) {
		// 画面のリセット（このメソッドは何回もよばれるので）
		gl2.glClear(GL.GL_COLOR_BUFFER_BIT);
		
		// 今の視点(とか諸々)を記憶
		gl2.glPushMatrix();
		
		// 回転角に応じて視点を回転
		gl2.glRotatef(angleX, 1.0f, 0.0f, 0.0f);
		// ティーポットを描画
		glut.glutWireTeapot(2.0f);
		
		// 回転を次回に引きずらないように記憶を取り戻す
		gl2.glPopMatrix();
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		gl2 = drawable.getGL().getGL2();
		glut = new GLUT();
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		System.out.println("width:" + width + " height: " + height);
	    float ratio = (float)height / (float)width;
	    gl2.glViewport(0, 0, width, height);

	    //定数はGLではなく、GL2にあります。
	    //（正確にはjavax.media.opengl.fixedfunc.GLMatrixFuncみたい）
	    gl2.glMatrixMode(GL2.GL_PROJECTION);
	    gl2.glLoadIdentity();
	    gl2.glFrustum(-1.0f, 1.0f, -ratio, ratio, 5.0f, 40.0f);

	    gl2.glMatrixMode(GL2.GL_MODELVIEW);
	    gl2.glLoadIdentity();
	    gl2.glTranslatef(0.0f, 0.0f, -20.0f);
	}

	@Override
	public void rotate(float x, float y, float z) {
		// 回転命令を受け取ったら回転角を増やす（今はX軸のみ）
		angleX += x;
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
