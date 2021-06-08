package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws InterruptedException, IOException {
        //Connect to server
       Socket socket = new Socket("localhost",4001);
       System.out.println("Connected to the server");
       BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
       PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

       Scanner scn = new Scanner(System.in);
       String msg;
       do{  //get input from console
           System.out.println("Enter the message you want to send to the server : ");
           msg = scn.nextLine();
           //Pass message to the server
           out.println(msg);
           //Response from the server
           String response = in.readLine();
           System.out.println(response);
       }while(!msg.equals("exit"));
        // Thread.sleep(5000);
    }
}
