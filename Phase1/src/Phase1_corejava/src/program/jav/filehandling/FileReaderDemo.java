package program.jav.filehandling;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
  public static void main(String[] args) {

    char[] array = new char[60];
    
    try {
      // Step 1: Creates a reader using the FileReader
      FileReader input = new FileReader("C://Users//Virendra//Desktop//Simplilearn//FSD_Phase_1//Prolim_Weeekday//phase1.txt");

      // Step 2: Reads characters
      input.read(array);
      
      System.out.println("Data in the file:");
      System.out.println(array);

      // Step 3: Closes the reader
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}