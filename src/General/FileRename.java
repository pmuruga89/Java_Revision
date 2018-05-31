package General;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		
		File dir = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\RenameFile");
		File list[] = dir.listFiles();
		
		for(File f : list){
			if(f.getName().endsWith(".pdf")){
				File dest = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\RenameFile\\"+f.getName().replace(".pdf", "")+".xlsx");
				f.renameTo(dest);
			}
		}
		System.out.println("File Rename Completed.");
		
	}

}
