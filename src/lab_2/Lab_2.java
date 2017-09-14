/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

import static java.lang.System.in;
import java.util.Scanner;



/**
 *
 * @author Justin Reichard
 */
public class Lab_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter how many lists you will entering.");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        BikePart[] bikePartArray = new BikePart [num];
        
        in.nextLine();
        System.out.println("Please enter the " + num + " lists");
        for(int i=0; i<num; i++){
            String s = in.next();
        
            String[] ss = s.split(",");

            
        bikePartArray[i] = new BikePart(ss[0],Integer.parseInt(ss[1]),Double.parseDouble(ss[2]),Double.parseDouble(ss[3]),Boolean.parseBoolean(ss[4]),Integer.parseInt(ss[5]));
        }
        System.out.println("\nHere are all the parts less then 20$ \n");
        //System.out.println(bikePartArray);
        for(BikePart b: bikePartArray){
            if(b.getPrice() < 20)
                System.out.println(b);
        }
        
    }
    //     seat,12345,15.00,10.00,true,100
    //     Bell,23456,5.50,3.75,false,300
    //     Wheel,98765,40.00,26.98,false,30
}
