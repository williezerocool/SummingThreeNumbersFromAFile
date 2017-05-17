/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summingthreenumbersfromafile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class SummingThreeNumbersFromAFile {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException  {
        
        
        Scanner input = new Scanner(new File("/Users/kendrabooker/Documents/3nums.txt"));
       
        System.out.println("Reading numbers from file \"3nums.txt\"... done.");
       
            int  a = input.nextInt();
            int  b = input.nextInt();
            int  c = input.nextInt();
            int sum = a + b + c;
            System.out.println(sum);
            
         
        
  
    
    
    }
    
}
