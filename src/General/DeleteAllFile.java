package General;

import java.io.File;

public class DeleteAllFile {

	public static void main(String[] args) {
		
		File dir = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\DeleteFileClass");
		
		File list[] = dir.listFiles();
		
		for(File f : list){
			
			if(f.getName().endsWith(".txt")){
				f.delete();
			}
		}
		System.out.println("All file Deleted.");

	}

}
