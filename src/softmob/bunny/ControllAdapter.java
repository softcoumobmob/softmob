package softmob.bunny;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * マウスとキーで操作するコントローラを実装しやすくするために、必ずしも必要でないメソッドを空メソッドで実装した抽象クラスです。
 * @author 
 *
 */
public abstract class ControllAdapter implements MouseListener, MouseMotionListener, KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// なにもしない
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// なにもしない
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// なにもしない
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// なにもしない
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// なにもしない
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// なにもしない
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// なにもしない
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// なにもしない
	}

}
