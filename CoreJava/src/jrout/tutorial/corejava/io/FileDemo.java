package jrout.tutorial.corejava.io;

import java.io.File;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("Batch244.txt");
		System.out.println(file.exists());
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.getAbsolutePath());
		
		File folder = new File("/Users/jrout/git/batch24/CoreJava/src/jrout/tutorial/corejava/io");
		System.out.println(folder.isDirectory());
		
		String files[] = folder.list();
		for(String iofile : files){
			System.out.println(iofile);
		}
		
		
	}

}
