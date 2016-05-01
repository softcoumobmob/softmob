package se2.bunny;

import java.io.File;
import java.util.ArrayList;

/**
 * plyの情報をファイルから読み取って、それに含まれる情報から最終的に{@code Face}の集合を返します。
 * @author 担当者未定
 *
 */
public class PLYFileParser implements PLYSource{
	
	private File file;
	
	public PLYFileParser(File file){
		this.file  = file;
	}

	@Override
	public ArrayList<Face> getFaces() {
		// TODO Auto-generated method stub
		return null;
	}

}
