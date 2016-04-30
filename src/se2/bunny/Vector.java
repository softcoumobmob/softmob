package se2.bunny;

public class Vector {
	private float x;
	private float y;
	private float z;
	
	public Vector(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public float getX(){
		return x;
	}
	public float getY(){
		return y;
	}
	public float getZ(){
		return z;
	}
	public Vector getNormalized(){
		// 正規化した(長さが1になった)ベクトルを作って返す
		return this;
	}
}
