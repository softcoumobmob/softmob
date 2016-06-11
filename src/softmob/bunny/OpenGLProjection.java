package softmob.bunny;

import com.jogamp.opengl.GL2;

/**
 * OpenGLで取り扱われる環境（視点など）を格納するコンテナクラスです。
 * @author
 *
 */
public class OpenGLProjection extends Object{
	private double[] eyePoint; //視点
	private double[] defaultEyePoint;
	private double[] sightPoint; //注視点
	private double[] defaultSightPoint;
	private double[] rotation; //回転量
	private double[] defaultRotation = {0.0, 0.0, 0.0};
	private double fovy; //視野角
	private double defaultFovy;
	private double near; //近
	private double defaultNear;
	private double far; //遠
	private double defaultFar;
	
	/**
	 * 空のプロジェクションを作成します
	 */
	public OpenGLProjection(){
		super();
	}

	/**
	 * 視点を設定します。初めて視点が設定された場合、それをデフォルト値として記憶します。
	 * (PS:セッターメソッドを全部実装するの面倒だったので、1つだけ例示しておきます。この例は残さなくて構いません。振る舞いが変わらない範囲で担当者が好きに実装してください。)
	 * @param eyePoint
	 */
	public void setEyePoint(double[] eyePoint){
		if(this.defaultEyePoint == null){ this.defaultEyePoint = eyePoint; }
		this.eyePoint = eyePoint;
	}
	public void setSightPoint(double[] sightPoint){
		//TODO
	}
	public void setRotation(double[] rotation){
		//TODO
	}
	public void setFovy(double fovy){
		//TODO
	}
	public void setNear(double near){
		//TODO
	}
	public void setFar(double far){
		//TODO
	}

	/**
	 * GLにプロジェクションの内容を適用します。
	 * @param gl グラフィックライブラリ
	 */
	public void apply(GL2 gl){
		//TODO		
	}
	
	/**
	 * プロジェクションの内容を全てデフォルト値に戻します。
	 */
	public void reset(){
		this.eyePoint = this.defaultEyePoint;
		this.sightPoint = this.defaultSightPoint;
		this.rotation = this.defaultRotation;
		this.fovy = this.defaultFovy;
		this.near = this.defaultNear;
		this.far = this.defaultFar;
	}
}
