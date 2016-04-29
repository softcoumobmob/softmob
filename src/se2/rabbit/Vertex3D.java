package se2.rabbit;

public class Vertex3D {
	private float[] coordinates = new float[3];
	private float confidence;
	private float intensity;
	public Vertex3D(float x, float y, float z){
		coordinates[0] = x;
		coordinates[1] = y;
		coordinates[2] = z;
	}
	public void setConfidence(float confidence){
		this.confidence = confidence;
	}
	public void setIntensity(float intensity){
		this.intensity = intensity;
	}
	public float getX(){
		return coordinates[0];
	}
	public float getY(){
		return coordinates[1];
	}
	public float getZ(){
		return coordinates[2];
	}
	
	@Override
	public String toString(){
		return "{" + coordinates[0] + ", " + coordinates[1] + ", " + coordinates[2] + "}[" + confidence + ", " + intensity + "]";
	}
}
