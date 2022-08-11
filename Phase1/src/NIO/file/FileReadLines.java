package program.jav.NIO.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadLines {
	public static void main(String[] args) {
		
		Path path = Paths.get("E:/data/file.txt");
		try {
			byte[] bs = Files.readAllBytes(path);
			List<String> strings = Files.readAllLines(path);
			
			System.out.println("Read bytes: \n"+ new String(bs));
			System.out.println("Read lines: \n"+ strings);
			
			//---------------------Delete File from the path------------------//
			Files.delete(path);
			    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}