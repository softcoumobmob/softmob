package se2.bunny;

import java.util.ArrayList;

/**
 * 図形または立体の頂点１つを表します。頂点は複数の座標から成ります。
 * @author kawabata
 *
 */
public class Vertex {
	private ArrayList<Float> coordinate;
	/**
	 * ３次元空間における頂点インスタンスを生成します。
	 * @param x X座標
	 * @param y Y座標
	 * @param z Z座標
	 */
	public Vertex(float x, float y, float z){
		coordinate = new ArrayList<Float>();
		coordinate.add(x);
		coordinate.add(y);
		coordinate.add(z);
	}
	
	/**
	 * この頂点の、{@code index}番目の座標軸における座標を返します。
	 * @param index 座標軸の番号
	 * @return その座標軸における座標
	 */
	public float get(int index){
		return coordinate.get(index);
	}

	/**
	 * 3次元空間以上での表現を簡単にするために設けられていて、{@code get(0)}と等価です。
	 * @return X座標
	 */
	public float getX(){
		return get(0);
	}
	/**
	 * 3次元空間以上での表現を簡単にするために設けられていて、{@code get(1)}と等価です。
	 * @return Y座標
	 */
	public float getY(){
		return get(1);
	}
	/**
	 * 3次元空間以上での表現を簡単にするために設けられていて、{@code get(2)}と等価です。
	 * @return Z座標
	 */
	public float getZ(){
		return get(2);
	}

}
