/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summingthreenumbersfromafile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kendrabooker
 */
public class SummingThreeNumbersFromAFile {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException  {
        
        File file = new File("/Users/kendrabooker/Documents/3nums.txt");
        Scanner input = new Scanner(file);
       
        System.out.println("Reading numbers from file \"3nums.txt\"... done.");
       
        while(input.hasNext()){
           
            
            int num = input.nextInt();
            System.out.print(num + " ");
            
         }
        
  
    
    
    }
    
}
