package se2.bunny;

import java.util.ArrayList;

/**
 * <I>暫定</I>
 * 立体の面１つを表します。面は３つ以上の頂点({@code Vertex})から成ります。
 * （本当は{@code Face}はインターフェースで、それを継承して{@code TriangleFace3D}とか作るべきなんだろうなー。でも後から修正できそうだし今回は必要なさそうなのでとりあえず。）
 * @author 担当者未定
 *
 */
public class Face {
	private ArrayList<Vertex> vertexs;
	public Face(Vertex v1, Vertex v2, Vertex v3){
		vertexs = new ArrayList<Vertex>();
		vertexs.add(v1);
		vertexs.add(v2);
		vertexs.add(v3);
	}
	/**
	 * この面に含まれる頂点を配列の形で返します。
	 * @return この面を構成する頂点の配列
	 */
	public Vertex[] toArray(){
		return vertexs.toArray(new Vertex[0]);
	}
	/**
	 * この面の面法線ベクトルを計算し、正規化して配列の形で返します。
	 * @return この面の正規化済み面法線ベクトル
	 */
	public float[] getNormalVector(){
		return null;
	}
}
