package softmob.bunny;

import java.awt.Frame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.gl2.GLUT;

/**
 * OpenGLで扱える、MVCのビューです。
 * @author 
 *
 */
public class OpenGLView extends Frame{
	private OpenGLModel model;
	private OpenGLController controller;
	private GLCanvas canvas = new OpenGLRenderingArea();
	private GL2 gl;
	private GLU glu;
	private GLUT glut;
	
	public OpenGLView(OpenGLModel model){
		super();
		this.model = model;
	}
	
	public void addController(OpenGLController controller){
		this.controller = controller;
		canvas.addMouseListener(controller);
		canvas.addMouseMotionListener(controller);
		canvas.addKeyListener(controller);
	}
}
