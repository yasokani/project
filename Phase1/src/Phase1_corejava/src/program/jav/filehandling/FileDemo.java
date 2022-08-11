package program.jav.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	   
	   public static void main(String[] args) {
		   try {  
	            File file = new File("C://Users//Virendra//Desktop//Simplilearn//FSD_Phase_1//Prolim_Weeekday//hello.txt");  // this is used to create the file
	            
	            if (file.createNewFile()) {  
	                System.out.println("New File is created!");  
	            } else {                   
	                if(file.exists())
	                {
	                    System.out.println("File already exists.");	
	                    System.out.println("File path:" + file.getAbsolutePath());
	                    System.out.println("File name:  " + file.getName());
	                    System.out.println("File class:  " + file.getClass());
	                    System.out.println("File parent:  " + file.getParent());
	                    System.out.println("File space allocated:  " + file.getUsableSpace());
	                    System.out.println("File length: " + file.length());
	                    System.out.println("File list:   " + file.list());
	                    
	                }
	                else
	                {
	                	System.out.println("File doesnot exists.");
	                }
	               
	                //--------------Delete the file code below-------------//
	                boolean b = file.delete();
	                if(b==true)
	                {
	                	System.out.println("File deleted !!");
	                }
	                else
	                {
	                	System.out.println("File not deleted");
	                }
	                //------------end of the above code--------------------//
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  	  
	   }
	}
