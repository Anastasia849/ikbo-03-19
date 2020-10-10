package ru.mirea.lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try
        {
            //t1 and t3
            FileWriter writer = new FileWriter("testfile.txt", false);
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            writer.write(text);
            writer.flush();
            writer.close();

            //t2
            FileReader reader =new FileReader("testfile.txt");
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
            reader.close();
            //t4
            System.out.println();
            FileWriter writer1 = new FileWriter("testfile.txt", true);
            text = in.nextLine();
            writer1.write(text);
            writer1.flush();
            writer1.close();


            FileReader reader1 =new FileReader("testfile.txt");
            while((c=reader1.read())!=-1){
                System.out.print((char)c);
            }
            reader1.close();

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
