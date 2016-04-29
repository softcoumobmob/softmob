package se2.bunny;

import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.util.Animator;

/**
 * StanfordBunnyアプリケーションの実行クラスです。
 * コンストラクタを見て分かる通り、「BunnyEventListener」「BunnyControlListener」を実装することでアプリケーションは完成します。
 * @author kawabata
 *
 */
@SuppressWarnings("serial")
public class StanfordBunny extends JFrame implements WindowListener{
	
	private Animator animator;
	/**
	 * Create the frame.
	 */
	public StanfordBunny() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		GLJPanel contentPane = new GLJPanel();
		BunnyEventListener view = new BunnyEventListener();
		ControlAdapter control = new BunnyControlListener(view);
		contentPane.addGLEventListener(view);
		contentPane.addMouseListener(control);
		contentPane.addMouseMotionListener(control);
		setContentPane(contentPane);
		
		animator = new Animator(contentPane);
		animator.start();
		
		addWindowListener(this);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StanfordBunny frame = new StanfordBunny();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	
	@Override
	public void windowClosing(WindowEvent e) {
		animator.stop();
	}
	@Override
	public void windowClosed(WindowEvent e) {
		animator.stop();
	}
	
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}


}
