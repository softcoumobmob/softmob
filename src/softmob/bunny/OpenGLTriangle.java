package softmob.bunny;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.gl2.GLUT;

/**
 * OpenGLで扱える三角形ポリゴンです。
 * @author kawabata
 *
 */
public class OpenGLTriangle extends OpenGLObject{
	private double[] vertex1;
	private double[] vertex2;
	private double[] vertex3;
	private double[] normalUnitVertex;
	public OpenGLTriangle(double[] vertex1, double[] vertex2, double[] vertex3){
		super();
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.vertex3 = vertex3;
		this.normalUnitVertex = normalUnitVertex();
	}
	private double[] normalUnitVertex() {
		//TODO
		return null;
	}
	@Override
	public void rendering(GL2 gl, GLU glu, GLUT glut){
		//TODO
	}
}
