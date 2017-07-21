/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario.pyramid.text.file.option;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author KurstDisciple
 */
public class MarioPyramidTextFileOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char keepGoing='y';
        do{
            char textFile='a';
            System.out.print("What size Pyramid do you wish to make? (1-20) ");
            int size = in.nextInt();
            while (size>20 || size<1){
                System.out.print("Please enter a valid size. ");
                size = in.nextInt();
            }
            System.out.print("Would you like to:\n"
                    + "a) Display the result here. or b) Save the result to a textfile. ");
            textFile = in.next().charAt(0);
            String pyramid = "";                                    //Declaration of the string into which to construct each layer of pyramid.
            for (int i=1;i<=size;i++){                              //For loop to increment through the tiers of the pyramid.
                for (int spaces = size-i; spaces>0; spaces--){      //Right alligning the pyramid tiers.
                    pyramid+=' ';
                }
            
                pyramid+='#';                                       /*Each tier has 1 hash followed by the number of hashes equal 
                                                                    to the tier level starting from the top.*/
            
                for (int hashes = i; hashes>0; hashes--){           //Adding hashes equalling each tier.
                    pyramid+='#';
                }
                pyramid+="\n";
            }
            if (textFile=='b'){
               System.out.println("Saving to: MarioPyramidSize"+size+".txt");
               try{
                    PrintWriter writer = new PrintWriter("MarioPyramidSize"+size+".txt", "UTF-8");
                    writer.print(pyramid);
                    writer.close();
                } catch (IOException e) {
                    System.out.println("There was an error.");
                }
            }
            else{
                System.out.println();
                System.out.println(pyramid);
            }
            System.out.println("Would you like to generate another pyramid? y/n ");
            keepGoing= in.next().charAt(0);
        }while(keepGoing=='y');
}
}
