package praktikum4_ara;

import java.util.Arrays;
import java.util.Scanner;

public class Praktikum4_Ara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int [] number ={1,3,5,7,9};
        //System.out.println(Arrays.toString(number));
        
     // for(int i = 0; i < 5; i++){
     // for(int i = 0; i < number.length; i++){        
     //    System.out.println(number[i]);
        
     // for(int num:number){
     //    System.out.println(num);
        
        //Scanner input = new Scanner(System.in);
        
        //int[] nilai = new int[3];
        
        //System.out.print("Nilai Matematika : ");
        //nilai[0] = input.nextInt();
        //System.out.print("Nilai Logika : ");
        //nilai[1] = input.nextInt();
        //System.out.print("Nilai Bahasa : ");
        //nilai[2] = input.nextInt();
        
        //for(int print:nilai){
            //System.out.print(print + " ");
        //}
        
        //System.out.println();
        
        //nilai[1] = 86;
        //for(int print:nilai){
            //System.out.print(print + " ");
        //}
        
        int nilai [][] = {{90, 75, 80}, {80, 90, 80}, {70, 75,95}};
        for(int[] i : nilai){
            for(int j : i){
                System.out.println(j);
                
            }
        }
        nilai[0][1] = 70;
        
        System.out.println("Nilai setelah diganti ");
        
        for(int[] i : nilai){
            for(int j : i){
                System.out.println(j);
            }
        }
    }
}
