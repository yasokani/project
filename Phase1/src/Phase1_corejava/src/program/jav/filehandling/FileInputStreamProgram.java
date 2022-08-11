package program.jav.filehandling;

import java.io.*; 
//Java program demonstrating FileInputStream  
public class FileInputStreamProgram 
{ 
  public static void main(String args[]) throws IOException 
  { 

      //attach the file to FileInputStream 
      FileInputStream fin= new FileInputStream("C://Users//Virendra//Desktop//Simplilearn//FSD_Phase_1//Prolim_Weeekday//phase1.txt"); 

      //illustrating getChannel() method 
      System.out.println(fin.getChannel()); 
      
 

      //illustrating getFD() method 
      //Returns the FileDescriptor object that represents the connection to the actual file
      //in the file system being used by this
      //System.out.println(fin.getFD()); 

      //illustrating available method 
      //Returns an estimate of the number of remaining bytes that can be read (or skipped over)
      //from this input stream
      System.out.println("Number of bytes read:"+fin.available()); 

      //illustrating skip method 
      /*Original File content: 
      * This is my first line 
      * This is my second line*/
      fin.skip(7); 
      System.out.println("FileContents :"); 
      //read characters from FileInputStream and write them 
      int ch; 
      while((ch=fin.read())!=-1) 
          System.out.print((char)ch); 
        
      //close the file 
      fin.close(); 
  } 
} 
