package program.jav.NIO.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.charset.Charset;

public class Create_WriteFile {
   public static void main(String[] args) {
      
	   //initialize Path object
      Path path = Paths.get("E:file.txt");
      
      //create file
      try {
         Path createdFilePath = Files.createFile(path);
         System.out.println("Created a file at : "+createdFilePath);
      } 
      catch (IOException e) {
         e.printStackTrace();
      }
      
      //---------------------Write into the File----------------------//
      
      Path pathw = Paths.get("E:file.txt");
      String question = "To be or not to be?";
      Charset charset = Charset.forName("ISO-8859-1");
      try {
         Files.write(pathw, question.getBytes());
         List<String> lines = Files.readAllLines(pathw, charset);
         for (String line : lines) {
            System.out.println(line);
         }
      } 
      catch (IOException e) {
         System.out.println(e);
      }
   }
}