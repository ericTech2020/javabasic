package com.java.javabasic.basic.fileDemo;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {


    final static String fileName="filename.txt";
    public static void main(String[] args) {

        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        readFile();
        deleteFile();
    }




    public static void writeFile() throws IOException {

        FileWriter myWriter=new FileWriter(fileName);
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");

    }


    public static void readFile(){

        File myObj=new File(fileName);
        Scanner myReader= null;
        try {
            myReader = new Scanner(myObj);
       while   (myReader.hasNextLine()){
            String data=myReader.nextLine();
            System.out.println(data);
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            myReader.close();
        }

    }

    public static void deleteFile(){

        File myObj=new File(fileName);
        if (myObj.delete()){
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
