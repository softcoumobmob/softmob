package se2.rabbit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PLYファイル読み取り機
 * 当座必要な要素から追加
 * 形式に合わない入力ファイルとかはとりあえず考慮しないでbun_zipper.plyにのみ照準を絞る
 * @author kawabata
 *
 */
public class PLYParser {
	private static final String REGEX_END_HEADER = "(?i)^end_header$";
	private static final String REGEX_ELEMENT = "(?i)^element$";
	
	private static final String REGEX_VERTEX = "(?i)^vertex$";
	private static final String REGEX_FACE = "(?i)^face$";	
	
	private File file;
	public PLYParser(File file){
		this.file = file;
	}
	
	public List<TriangleFace> read() throws IOException{
		List<TriangleFace> faces = new ArrayList<TriangleFace>();
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		int vertexNum = 0;
		int faceNum = 0;		
		while((line = in.readLine()) != null){
			String[] args = line.split("\\s");
			if(args[0].matches(REGEX_END_HEADER)){ break; }
			if(args[0].matches(REGEX_ELEMENT)){
				if(args[1].matches(REGEX_VERTEX)){
					vertexNum = Integer.parseInt(args[2]);
					continue;
				}
				if(args[1].matches(REGEX_FACE)){
					faceNum = Integer.parseInt(args[2]);
					continue;
				}
			}
		}
		ArrayList<Vertex3D> vertexs = new ArrayList<Vertex3D>();
		for(int i = 0; i < vertexNum; i++){
			line = in.readLine();
			String[] args = line.split("\\s");
			float x = Float.parseFloat(args[0]);
			float y = Float.parseFloat(args[1]);
			float z = Float.parseFloat(args[2]);
			vertexs.add(new Vertex3D(x,y,z));
		}
		for(int i = 0; i < faceNum; i++){
			line = in.readLine();
			String[] args = line.split("\\s");
			Vertex3D v1 = vertexs.get(Integer.parseInt(args[1]));
			Vertex3D v2 = vertexs.get(Integer.parseInt(args[2]));
			Vertex3D v3 = vertexs.get(Integer.parseInt(args[3]));
			faces.add(new TriangleFace(v1,v2,v3));
		}
		in.close();
		return faces;
	}
	
	public static void main(String[] args) throws IOException{
		PLYParser test = new PLYParser(new File("/Users/kawabata/Dropbox/_Workspace/SoftwareEngineering2/src/se2/rabbit/bun_zipper.ply"));
		float x_max = Float.MIN_VALUE;
		float x_min = Float.MAX_VALUE;
		float y_max = Float.MIN_VALUE;
		float y_min = Float.MAX_VALUE;
		float z_max = Float.MIN_VALUE;
		float z_min = Float.MAX_VALUE;

		for(TriangleFace face: test.read()){
			for(Vertex3D vertex: face.toArray()){
				if(vertex.getX() > x_max){ x_max = vertex.getX(); }
				if(vertex.getX() < x_min){ x_min = vertex.getX(); }
				if(vertex.getY() > y_max){ y_max = vertex.getY(); }
				if(vertex.getY() < y_min){ y_min = vertex.getY(); }
				if(vertex.getZ() > z_max){ z_max = vertex.getZ(); }
				if(vertex.getZ() < z_min){ z_min = vertex.getZ(); }
			}
		}
		System.out.println("x_max: " + x_max);
		System.out.println("x_min: " + x_min);
		System.out.println("y_max: " + y_max);
		System.out.println("y_min: " + y_min);
		System.out.println("z_max: " + z_max);
		System.out.println("z_min: " + z_min);
		
		System.out.println("x_cen: " + (x_max+x_min)/2);
		System.out.println("y_cen: " + (y_max+y_min)/2);
		System.out.println("z_cen: " + (z_max+z_min)/2);		
		
	}
}
