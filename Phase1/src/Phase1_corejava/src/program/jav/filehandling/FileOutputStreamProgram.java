//This program is used to write to an exiting file and will not delete the contents which are already
//inside the files
package program.jav.filehandling;

import java.io.BufferedOutputStream; 
import java.io.DataInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 

public class FileOutputStreamProgram 
{ 
    public static void main(String[] args) throws IOException  
    { 
        //Step 1: attach keyboard to DataInputStream 
        DataInputStream dis=new DataInputStream(System.in); 
  
        // Step 2: attach file to FileOutputStream 
        FileOutputStream fout=new FileOutputStream("C://Users//Virendra//Desktop//Simplilearn//FSD_Phase_1//Prolim_Weeekday//phase1.txt",true); 
  
        //Step 3:attach FileOutputStream to BufferedOutputStream 
        BufferedOutputStream bout=new BufferedOutputStream(fout,1024); 
        System.out.println("Enter text (@ at the end):"); 
        char ch; 
  
        //read characters from dis into ch. Then write them into bout. 
        //repeat this as long as the read character is not @ 
        while((ch=(char)dis.read())!='@') 
        { 
            bout.write(ch); 
        } 
        //close the file 
        bout.close(); 
    } 
} 
