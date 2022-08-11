package program.jav.basic;

public class Array_2D { 
    public static void main(String[] args) 
    {  
        int[][] arr = { { 1, 2 }, { 3, 4 } }; 
  
        for (int i = 0; i < 2; i++) {                // for row
            for (int j = 0; j < 2; j++) {            // for column
                System.out.print(arr[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
} 
