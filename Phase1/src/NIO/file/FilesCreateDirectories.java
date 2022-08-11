package program.jav.NIO.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCreateDirectories {

	public static void main(String[] args) {
		
		// initialize Path objects
		Path path1 = Paths.get("E:/viren");
		Path path2 = Paths.get("E:/viren/java8");
		Path path3 = Paths.get("E:/viren/java8/Files");
		
		try {
			Path createdDir1 = Files.createDirectory(path1);//first level directory
			Path createdDir2 = Files.createDirectory(path2);//second level directory
			Path createdDir3 = Files.createDirectory(path3);//all level directories
			
			System.out.println("First Level Directory Created at Path : "+createdDir1);
			System.out.println("Second Level Directory Created at Path : "+createdDir2);
			System.out.println("All Level Directories Created at Path : "+createdDir3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}