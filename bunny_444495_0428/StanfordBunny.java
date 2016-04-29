package se2.rabbit;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.util.Animator;

@SuppressWarnings("serial")
public class StanfordBunny extends JFrame implements GLEventListener{

	private JPanel contentPane;
	private List<TriangleFace> triangles;
	private GL2 gl2;
	private float angleX = 0.0f;
	private float angleY = 0.0f;
	private float scale = 5.0f;
	Animator animator;
	final float x_cen, y_cen, z_cen;

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public StanfordBunny() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		GLJPanel panel = new GLJPanel();
		panel.addGLEventListener(this);
		MouseAdapter adp = new BunnyMouseAdapter();
		panel.addMouseListener(adp);
		panel.addMouseMotionListener(adp);
		contentPane.add(panel);
		
		animator = new Animator(panel);
		animator.start();
		
		PLYParser parser = new PLYParser(new File("/Users/kawabata/Dropbox/_Workspace/SoftwareEngineering2/src/se2/rabbit/bun_zipper.ply"));
		triangles = parser.read();
		
		float x_max = Float.MIN_VALUE;
		float x_min = Float.MAX_VALUE;
		float y_max = Float.MIN_VALUE;
		float y_min = Float.MAX_VALUE;
		float z_max = Float.MIN_VALUE;
		float z_min = Float.MAX_VALUE;

		for(TriangleFace face: triangles){
			for(Vertex3D vertex: face.toArray()){
				if(vertex.getX() > x_max){ x_max = vertex.getX(); }
				if(vertex.getX() < x_min){ x_min = vertex.getX(); }
				if(vertex.getY() > y_max){ y_max = vertex.getY(); }
				if(vertex.getY() < y_min){ y_min = vertex.getY(); }
				if(vertex.getZ() > z_max){ z_max = vertex.getZ(); }
				if(vertex.getZ() < z_min){ z_min = vertex.getZ(); }
			}
		}
		x_cen = (x_max+x_min)/2;
		y_cen = (y_max+y_min)/2;
		z_cen = (z_max+z_min)/2;
	}

	@Override
	public void display(GLAutoDrawable drawable) {
		gl2.glClear(GL.GL_COLOR_BUFFER_BIT);

		gl2.glPushMatrix();
		gl2.glRotatef(angleX, 1.0f, 0.0f, 0.0f);
		gl2.glRotatef(angleY, 0.0f, 1.0f, 0.0f);
		gl2.glScalef(scale, scale, scale);
		for(TriangleFace face: triangles){
			gl2.glBegin(GL2.GL_POLYGON);
			Vertex3D[] vertexs = face.toArray();
			for(Vertex3D vertex: vertexs){
				gl2.glVertex3f(vertex.getX()-x_cen, vertex.getY()-y_cen, vertex.getZ()-z_cen);
				
			}
			gl2.glEnd();
		}
		gl2.glPopMatrix();
	}

	@Override
	public void dispose(GLAutoDrawable drawable) {
		animator.stop();
	}

	@Override
	public void init(GLAutoDrawable drawable) {
		gl2 = drawable.getGL().getGL2();
		//gl2.glEnable(GL2.GL_LIGHTING);
	    //gl2.glEnable(GL2.GL_LIGHT0);
	}

	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		
	}
	
	private class BunnyMouseAdapter extends MouseAdapter{
		// http://itpro.nikkeibp.co.jp/article/COLUMN/20060807/245274/?ST=develop
		private int preMouseX;
		private int preMouseY;
		@Override
		public void mousePressed(MouseEvent e) {
            preMouseX = e.getX();
            preMouseY = e.getY();
        }
		@Override
		public void mouseDragged(MouseEvent e) {
	        int x = e.getX();
	        int y = e.getY();
	        Dimension size = e.getComponent().getSize();
	        float angleDeltaX = 360.0f * ((float)(preMouseY-y)/size.height);
	        float angleDeltaY = 360.0f * ((float)(x-preMouseX)/size.width);
	        // 角度の更新
	        angleX -= angleDeltaX;
	        angleY += angleDeltaY;
	        // 現在のマウスの位置を保存
	        preMouseX = x;
	        preMouseY = y;
	    }
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
}
