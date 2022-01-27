package com.company;
import java.io.File;
import java.util.Scanner;

public class SearchFile {


    private void Filefinder(){
        // address of files or folder where to search
        File file = new File("C:\\Users\\new\\Desktop");
        String str ;
        Scanner in = new Scanner(System.in);
        do{
            int ab =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            str =in.nextLine();
            //list of file is stored in string
            String[] files = file.list();
            //continous check each file or folder

            for (String string : files){
                //check the name of file present or not and store in boolean str1
                Boolean str1 = str.equals(string);
                // str1 is true than print the following
                if (str1){
                    ab = 1;
                    System.out.println("File Found : "+string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            if(ab == 0){
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);
    }
    public static void main(String[] args){
        SearchFile obj =new SearchFile();
        obj.Filefinder();
    }
}
