package se2.bunny;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * BunnyControlListenerは、StanfordBunnyアプリケーションにおいてユーザからの操作をマウス及びキーボードによって受け付け、
 * Controllableを実装した、描画担当クラスに対して、拡大縮小や回転を行うように命じます。
 * @author 担当者未定
 *
 */
public class BunnyControlListener extends ControlAdapter{

	/**
	 * 描画を担当するGLEventListener実装オブジェクト。
	 * これに向かって指令を出す。（出せる指令の種類はControllableインターフェースで定義）
	 */
	private Controllable view;
	
	/**
	 * @param view このコントローラリスナーから指令を受け取る描画担当オブジェクト
	 */
	public BunnyControlListener(Controllable view){
		this.view = view;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
