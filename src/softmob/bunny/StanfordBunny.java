package softmob.bunny;

import java.awt.EventQueue;
import java.awt.Frame;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/**
 * 制作物の実行クラスです。
 * @author 
 *
 */
public class StanfordBunny extends Object{
	public static void main(String[] args){
		//TODO plyファイルのFileオブジェクトを作ること
		File file = new File("");
		//TODO ここまで
		List<OpenGLObject> objects = new ArrayList<OpenGLObject>();
		objects.add(new OpenGL3dGraphAxes());
		objects.add(new OpenGLCompound(file));
		OpenGLCompound compound = new OpenGLCompound(objects);
		List<OpenGLObject> compounds = new ArrayList<OpenGLObject>();
		compounds.add(compound);
		OpenGLModel model = new OpenGLModel(compounds);
		OpenGLView view = new OpenGLView(model);
		OpenGLController controller = new OpenGLController(model);
		model.addView(view);
		view.addController(controller);
		view.setBounds(0,0,200,100);
		view.setVisible(true);
	}
}
