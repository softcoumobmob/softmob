package se2.bunny.test;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import se2.bunny.ControlAdapter;
import se2.bunny.Controllable;

/**
 * 個人的なテストクラスです。''本番では一切使いません。''
 * @author kawabata
 *
 */
public class TestController extends ControlAdapter{

	private Controllable view;
	public TestController(Controllable view){
		this.view = view;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// マウスが押されたらX軸を軸に10度回転する（テストなので仮の動作）
		view.rotate(10.0f, 0.0f, 0.0f);
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
