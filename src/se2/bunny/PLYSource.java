package se2.bunny;

import java.util.ArrayList;

/**
 * 頂点の集合と、それを繋ぐ面からなる立体の情報の情報源です。
 * @author kawabata
 *
 */
public interface PLYSource {
	/**
	 * このplyフォーマットの情報が含む全ての面の集合を返します。
	 * @return 面の集合
	 */
	public ArrayList<Face> getFaces();
}
