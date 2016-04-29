package se2.bunny;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.util.Animator;

/**
 * テストモジュールです。
 * @author kawabata
 *
 */
@SuppressWarnings("serial")
public class TestStanfordBunny extends JFrame{
	
	private Animator animator;
	
	public TestStanfordBunny(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		// GLJPanelが描画される領域です。
		GLJPanel contentPane = new GLJPanel();
		TestEventListener view = new TestEventListener();
		ControlAdapter control = new TestController(view);
		// 描画領域に、描画クラスとコントローラを登録
		contentPane.addGLEventListener(view);
		contentPane.addMouseListener(control);
		contentPane.addMouseMotionListener(control);
		add(contentPane);
		
		// アニメータは実行クラスで管理するのが簡単でしょう多分
		animator = new Animator(contentPane);
		animator.start();
		
		addWindowListener(new WindowAdapter(){
			//ウィンドウが閉じるときはアニメータを終了させる
			@Override
			public void windowClosing(WindowEvent e){
				animator.stop();
			}
			@Override
			public void windowClosed(WindowEvent e){
				animator.stop();
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestStanfordBunny frame = new TestStanfordBunny();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
