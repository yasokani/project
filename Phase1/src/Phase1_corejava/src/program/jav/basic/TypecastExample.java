package program.jav.basic;

public class TypecastExample {
	
	public static void main(String[] args) 
    { 
        //---------TYPECAST BETWEEN INT and LONG------------//
		int i = 100;          
        long l = i;      // automatic type conversion from int to long    
        System.out.println("long value "+ l);
        
        int o =(int) l;   // explicit typecast from long to int 
        System.out.println("int value "+ o);
        
        char t=(char) i;
        System.out.println("char value "+ t);
        
        
        //--------TYPECAST BETWEEN DOUBLE and FLOAT---------//
        double d= 19067566565868.007969847578776565675;
        float r= (float) d;   // explicit typecast from double to float
        System.out.println("float value "+ r);
        System.out.println("double value "+d); 
        
        
        
        //--------TYPECAST FROM DOUBLE --> LONG --> INT in series---------//
        double d2 = 100.04;
        long l2 = (long)d2;      //explicit type casting required
        int i2 = (int)l2;       //explicit type casting required
        System.out.println("Double value "+d2);
        System.out.println("Long value "+l2);
        System.out.println("Int value "+i2);
        
        
        //--------TYPECAST BETWEEN LONG and FLOAT------------//
        float f = l;          // automatic type conversion from long to float
        System.out.println("float value "+ f); 
         
          
        
        //--------TYPECAST BETWEEN BYTE, INT and DOUBLE--------//    
        byte b;  
        int ii = 257;  
        double dd = 323.142; 
        
        System.out.println("Conversion of int to byte.");     
        b = (byte) ii;     //i%256 will happen
        System.out.println("i = " + i + " b = " + b); 
        
        System.out.println("\nConversion of double to byte."); 
        
        b = (byte) dd;      //d%256 will happen
        System.out.println("d = " + d + " b= " + b); 
    } 
}
