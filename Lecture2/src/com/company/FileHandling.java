package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        int c;
        String path = "C:\\Users\\tarun\\Desktop\\input.txt";
        String javaPath = path.replace("\\", "/"); // Create a new variable
        String path2 = "C:\\Users\\tarun\\Desktop\\output.txt";
        String javaPath1 = path.replace("\\", "/");
        try{
            in = new FileReader(javaPath);
            out = new FileWriter(javaPath1);
            while((c = in.read()) != -1){
                out.write(c);
            }
            System.out.println("file written");
        }catch(Exception e){
            System.out.println("Error !!");
        }finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}