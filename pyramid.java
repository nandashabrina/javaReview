/*
Nama       : Nanda Shabrina Putri Kurnia
NIM        : 2141762064
Absensi    : 14
Kelas      : SIB - 2E
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoudException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File myfile = new File("piramida.txt");
       
        try(BufferedWriter b = new BufferedWriter(new FileWriter(myfile))){
       
        int[] array = {2, 1, 4, 1, 7, 6, 2, 0, 6, 4};
        System.out.println("===PROGRAM MEMBUAT PIRAMIDA SEGITIGA===");
        int num = 0;
        System.out.print("Input a number : ");
        num = input.nextInt();
        int space;
        int i = 0;
        int row = 1;
        int maxSpace = num - 1;
         while (row <= num){
                int kolom = 1;
                space = maxSpace;
                
                while(space >= 1)
                {
                    b.write(" ");
                    space--;
                }
                while (kolom <= row){
                    b.write(array[i]+ " ");                
                    i++;
                    kolom++;
                }
                b.newLine();
                maxSpace--;
                row++;
            }
        }catch(IOException e){
            System.out.println("File "+myfile.getName()+" Tidak Dapat DIbaca");
        }
    }
    }
    
    
