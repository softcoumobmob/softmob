package softmob.bunny;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.gl2.GLUT;

/**
 * （OpenGLで）レンダリング可能であることを示します。
 * @author 
 *
 */
public interface Rendable {
	/**
	 * 指定されたグラフィックライブラリを用いてレンダリングします
	 * @param gl OpenGLグラフィックライブラリ
	 * @param glu OpenGLグラフィックユーティリティ
	 * @param glut OpenGLグラフィックライブラリユーティリティツールキット
	 */
	public void rendering(GL2 gl, GLU glu, GLUT glut);
}
