package program.jav.filehandling;

import java.io.File; 
import java.io.IOException; 
import java.io.RandomAccessFile; 
import java.lang.NumberFormatException; 
  
public class DisplayFriends { 
  
    public static void main(String data[]) 
    {   
        try { 
            String nameNumberString; 
            String name; 
            long number; 
            int index; 
  
            // Using file pointer creating the file. 
            File file = new File("C://Users//Mridul Sharma//Desktop//Simplilearn//FSD_Phase_1//friendsContact.txt"); 
  
            if (!file.exists()) {                 
                file.createNewFile();  // Create a new file if not exists. 
            } 
  
            // Opening file in reading and write mode.   
            RandomAccessFile raf = new RandomAccessFile(file, "rw"); 
            boolean found = false; 
  
            // Traversing the file getFilePointer() give the current offset value from start of the file. 
            while (raf.getFilePointer() < raf.length()) { 
                
            	// reading line from the file. 
                nameNumberString = raf.readLine(); 
  
                // finding the position of '!' 
                index = nameNumberString.indexOf('!'); 
  
                // separating name and number. 
                name = nameNumberString.substring(0, index); 
                number = Long.parseLong(nameNumberString.substring(index + 1)); 
  
                // Print the contact data 
                System.out.println("Friend Name: " + name + "\n" + "Contact Number: " + number + "\n"); 
            } 
        }
  
            catch (IOException ioe) 
            { 
                System.out.println(ioe); 
            } 
            
            catch (NumberFormatException nef) 
            { 
                System.out.println(nef); 
            } 
        } 
    } 