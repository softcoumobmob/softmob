package softmob.bunny;

import java.util.ArrayList;
import java.util.List;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.gl2.GLUT;

/**
 * OpenGLで扱える、MVCパターンでいうモデルです。
 * @author 
 *
 */
public class OpenGLModel extends Object implements Rendable, Controllable{
	private List<OpenGLObject> displayObjects;
	private OpenGLProjection projection = new OpenGLProjection();
	private List<OpenGLView> views = new ArrayList<OpenGLView>();
	
	/**
	 * モデルを作成します。
	 * @param displayObjects このモデルで取り扱うオブジェクト群です。
	 */
	public OpenGLModel(List<OpenGLObject> displayObjects){
		super();
		this.displayObjects = displayObjects;
	}
		
	/**
	 * ビューを追加します。モデルに変更があった時、全ての追加されたビューに通知されます。
	 * (OpenGLだとAutoDrawableの絡みで通知しなくても再描画される気がしますが)
	 * @param view
	 */
	public void addView(OpenGLView view){
		views.add(view);
	}
	/**
	 * モデルの表示倍率を変更します。
	 * (メモ：本当ならモデル・コンパウンド・オブジェクトがそれぞれ回転量を持つべきですが、今回の制作物ではコンパウンド1つに全てのオブジェクトが収まるので個別に回転量の管理を予定していません)
	 * @param scale 倍率
	 */
	public void setScale(double scale){
		//TODO
	}
	/**
	 * モデルの現在の表示倍率を返します。
	 * @return 表示倍率
	 */
	public double getScale(){
		//TODO
		return 0.0;
	}
	@Override
	public void expand(double scale){
		this.setScale(this.getScale() + scale);
	}
	/**
	 * モデルの表示回転量を一律に変更します。
	 * @param x x軸方向の回転量
	 * @param y y軸方向の回転量
	 * @param z z軸方向の回転量
	 */
	public void setRotation(double x, double y, double z){
		//TODO
	}
	/**
	 * モデルの現在の表示回転量を返します。
	 * @return
	 */
	public double[] getRotation(){
		//TODO
		return new double[3];
	}
	@Override
	public void rotate(double x, double y, double z){
		double[] now = this.getRotation();
		this.setRotation(now[0] + x, now[1] + y, now[2] + z);
	}
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rendering(GL2 gl, GLU glu, GLUT glut) {
		// TODO Auto-generated method stub
		
	}

}
