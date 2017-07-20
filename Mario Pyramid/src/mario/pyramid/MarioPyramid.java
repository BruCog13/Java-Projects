/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario.pyramid;
import java.util.Scanner;
/**
 *
 * @author KurstDisciple
 */
public class MarioPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("What size Pyramid do you wish to make? (1-20) ");
        int size = in.nextInt();
        while (size>20 || size<1){
            System.out.print("Please enter a valid size. ");
            size = in.nextInt();
        }
        System.out.println();
        System.out.println();
        for (int i=1;i<=size;i++){                              //For loop to increment through the tiers of the pyramid.
            String pyramid = "";                                //Declaration of the string into which to construct each layer of pyramid.
            for (int spaces = size-i; spaces>0; spaces--){      //Right alligning the pyramid tiers.
                pyramid+=' ';
            }
            
            pyramid+='#';                                       /*Each tier has 1 hash followed by the number of hashes equal 
                                                                to the tier level starting from the top.*/
            
            for (int hashes = i; hashes>0; hashes--){           //Adding hashes equalling each tier.
                pyramid+='#';
            }
            System.out.println(pyramid);
        }
    }
    
}
