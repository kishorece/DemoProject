package demo;

import java.nio.file.FileAlreadyExistsException;

public class KK {
	
	/*SuperClass*/
	private String name;
	private String id;
	public KK(String name,String id) {
		this.name=name;
		this.id=id;
		
	}
	
	public String calculateNameId(String str,String id) throws FileAlreadyExistsException{
		return str+id;
		
		
	}
	
	public static String getName(String str) {
		return str;
	}
	

}
