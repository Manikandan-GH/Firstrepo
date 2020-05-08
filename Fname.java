
public class Fname {
	
	private String Fullpath;
	private char pathseparator,extensionseparator;
	
	public Fname(String str,char pathsep,char exsep) {
		str= Fullpath;
		pathsep = pathseparator;
		extensionseparator = exsep;
	}
	
	public String extention() {
		int dot = Fullpath.lastIndexOf(extensionseparator);
		return Fullpath.substring(dot + 1);
		
	}
	
	public String filename() {
		int dot = Fullpath.lastIndexOf(extensionseparator);
		int sep = Fullpath.lastIndexOf(pathseparator);
		return Fullpath.substring(sep , dot);
	}
	
	public String path() {
		int sep = Fullpath.lastIndexOf(pathseparator);
		return Fullpath.substring(0,sep+1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Fpath= "/home/mani/java/javahtml.html";
		FileName mypath = new FileName(Fpath,'/','.');
		System.out.println("Extension = "+mypath.extension());
		System.out.println("filename = "+ mypath.filename());
		System.out.println("path = "+ mypath.path());

	}

}
