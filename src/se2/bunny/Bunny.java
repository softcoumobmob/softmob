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
    /*	private float angleX = 0.0f;
	private float angleY = 0.0f;
	private float scale = 5.0f;
	final float x_cen, y_cen, z_cen;
	private ArrayList<Face> faces=ply.getFaces();*/
	@Override
	public void draw(GL2 gl2) {
		// TODO Auto-generated method stu
	    /*   gl2.glClear(GL2.GL_COLOR_BUFFER_BIT);

		gl2.glPushMatrix();
		gl2.glRotatef(angleX, 1.0f, 0.0f, 0.0f);
		gl2.glRotatef(angleY, 0.0f, 1.0f, 0.0f);
		gl2.glScalef(scale, scale, scale);
		for(Face face: faces){
			gl2.glBegin(GL2.GL_POLYGON);
			Vertex[] vertexs = face.toArray();
			for(Vertex vertex: vertexs){
				gl2.glVertex3f(vertex.getX()-x_cen, vertex.getY()-y_cen, vertex.getZ()-z_cen);
			
			}
			gl2.glEnd();
			}	
			gl2.glPopMatrix();*/
	}
    
}
