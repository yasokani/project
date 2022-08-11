package ds.java.programs;

public class Array_2D { 
    public static void main(String[] args) 
    {  
        int[][] arr = { { 1, 2 }, { 3, 4 } }; 
  
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print(arr[i][j] + " "); 
            } 
            System.out.println(); 
            
            System.out.println(arr[0][0]);
            System.out.println(arr[0][1]);
            System.out.println(arr[1][0]);
            System.out.println(arr[1][1]);
            
        } 
    } 
} 
