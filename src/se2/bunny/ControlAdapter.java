package se2.bunny;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * ControlAdapterはStanfordBunnyアプリケーションで用いるコントローラを作りやすくするためのアダプタとなる抽象クラスです。
 * 今回のアプリケーションにおいて必要ないと思われる（が、インターフェースの都合上実装しないといけない）メソッドを
 * 空メソッドの形で実装しています。
 * 
 * 具体的には、MouseListener#mousePressed, MouseMotionListener#mouseDragged, KeyListener#keyPressed, KeyListener#keyReleased
 * を'''除く'''メソッドは空メソッドであらかじめオーバーライドされています。
 * コントローラは、この抽象クラスを継承し、上記4つのメソッドを適切に実装することで完成します。
 * @author kawabata
 *
 */
public abstract class ControlAdapter implements MouseListener, MouseMotionListener, KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// 何もしない
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// 何もしない
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// 何もしない
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// 何もしない
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// 何もしない
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// 何もしない
	}

}
