package se2.rabbit;

public class TriangleFace {
	private Vertex3D[] vertexs = new Vertex3D[3];
	public TriangleFace(Vertex3D v1, Vertex3D v2, Vertex3D v3){
		vertexs[0] = v1;
		vertexs[1] = v2;
		vertexs[2] = v3;
	}
	
	public String toString(){
		StringBuilder strb = new StringBuilder();
		strb.append("{");
		strb.append(System.lineSeparator());
		for(Vertex3D v: vertexs){
			strb.append("\t");
			strb.append(v.toString());
			strb.append(System.lineSeparator());			
		}
		strb.append("}");
		return strb.toString();
	}
	public Vertex3D[] toArray(){
		return vertexs;
	}
}
