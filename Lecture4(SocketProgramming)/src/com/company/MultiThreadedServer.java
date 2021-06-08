package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4001);
        System.out.println("Waiting for the client connection");
        //Since we can receive multiple request so we have to wait for multiple clients
        //Thus we will write socket.accept within the while loop
        while(true)
        {
            Socket clientSocket = socket.accept();
            System.out.println("Client Connected");
            messaging obj = new messaging(clientSocket);
            obj.start();
        }
    }
}
