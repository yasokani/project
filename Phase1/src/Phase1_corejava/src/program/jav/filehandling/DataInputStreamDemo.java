package program.jav.filehandling;

import java.io.*;    

public class DataInputStreamDemo {  
  public static void main(String[] args) throws IOException {  
    
	InputStream input = new FileInputStream("C://Users//Mridul Sharma//Desktop//Simplilearn//FSD_Phase_1//ABC.txt");  
    DataInputStream inst = new DataInputStream(input);  
    
    int count = input.available();  
    System.out.println(count);
    
    byte[] ary = new byte[count];  
    inst.read(ary);  
    for (byte bt : ary) {  
      char k = (char) bt;  
      System.out.print(k+"-");  
    }  
  }  
}  