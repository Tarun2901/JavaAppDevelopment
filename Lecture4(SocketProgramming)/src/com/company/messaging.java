package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class messaging extends Thread{
    Socket clientSocket;


    public messaging(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            String msg = null;
            do {
                msg = in.readLine();
                System.out.println("Client sent : " + msg);
                out.println("Server acknowledges this message : " + msg+"I am in :"+currentThread().getName());
            } while (!msg.equals("exit"));
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
