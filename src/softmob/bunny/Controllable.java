package softmob.bunny;

/**
 * (拡大・縮小・回転・リセットの)操作が可能であることを示します。
 * @author 
 *
 */
public interface Controllable {
	/**
	 * 表示倍率を定数だけ変動させます
	 * @param scale 表示倍率の変動量
	 */
	public void expand(double scale);
	
	/**
	 * 回転させます
	 * @param x x軸方向の回転角の変動量
	 * @param y y軸方向の回転角の変動量
	 * @param z z軸方向の回転角の変動量
	 */
	public void rotate(double x, double y, double z);

	/**
	 * 表示倍率と回転の状態を初期値に戻します
	 */
	public void reset();
}
