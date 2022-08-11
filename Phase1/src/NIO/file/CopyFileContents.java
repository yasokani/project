package program.jav.NIO.file;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class CopyFileContents {

	public static void main(String[] args) {
      Path sourceFile = Paths.get("E:file.txt");
      Path targetFile = Paths.get("E:fileCopy.txt");
      
      try {
         Files.copy(sourceFile, targetFile,
         StandardCopyOption.REPLACE_EXISTING);
      }
      catch (IOException ex) {
         System.err.format("I/O Error when copying file");
      }
      
      Path wiki_path = Paths.get("E:fileCopy.txt");
      Charset charset = Charset.forName("ISO-8859-1");
      try {
         List<String> lines = Files.readAllLines(wiki_path, charset);
         for (String line : lines) {
            System.out.println(line);
         }
      } 
      catch (IOException e) {
         System.out.println(e);
      }
   }	
}
