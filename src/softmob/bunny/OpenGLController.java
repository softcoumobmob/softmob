package softmob.bunny;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * マウスおよびキーからの入力が可能なコントローラです。
 * @author
 *
 */
public class OpenGLController extends ControllAdapter{
	private Controllable model;
	
	/**
	 * 指定したモデルを操作するためのコントローラを作成します。
	 * @param model このコントローラで操作されるモデル
	 */
	public OpenGLController(OpenGLModel model){
		super();
		this.model = model;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		// モデルを回転させる
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// モデルの拡大・縮小・リセットを行う
	}

}
