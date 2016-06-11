package softmob.bunny;

import java.io.File;
import java.util.List;

/**
 * PLYファイルを読み込むためのユーティリティクラスです。
 * @author 
 *
 */
public class PLYFileParser extends Object{
	private PLYFileParser(){
		super();
	}
	/**
	 * PLYファイルを読み取って三角形ポリゴンの集合を返します
	 * @param file PLYファイル
	 * @return PLYファイルを解読した結果としての三角形ポリゴンの順序立てられた集合
	 */
	public static List<OpenGLTriangle> parse(File file){
		//TODO
		return null;
	}
}
