package softmob.bunny;

import java.io.File;
import java.util.List;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.gl2.GLUT;

/**
 * 複数のオブジェクトをまとめたものです。うさぎはこのクラスの1つのインスタンスです（大量のOpenGLTriangleから成る）。
 * @author
 *
 */
public class OpenGLCompound extends OpenGLObject{
	private List<? extends OpenGLObject> components;
	
	/**
	 * 必ずしもファイルから生成しないサブクラスのために。
	 */
	protected OpenGLCompound(){
		super();
	}
	/**
	 * 指定されたファイルからオブジェクトコンパウンドを作成します。
	 * (とりあえずfileにはPLYファイルが入ってくるものとして実装して構いません)
	 * @param file
	 */
	public OpenGLCompound(File file){
		this(PLYFileParser.parse(file));
	}
	/**
	 * 指定されたオブジェクト群からオブジェクトコンパウンドを作成します
	 * @param objects
	 */
	public OpenGLCompound(List<? extends OpenGLObject> components) {
		super();
		this.components = components;
	}
	@Override
	public void rendering(GL2 gl, GLU glu, GLUT glut){
		//TODO
	}
}
