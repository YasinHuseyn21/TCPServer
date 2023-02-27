package server;

import lombok.SneakyThrows;
import utill.Utility;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static utill.Utility.readMessage;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(6565);
        while (true) {
            System.out.println("Wait Client...");
            Socket connection = serverSocket.accept();
            DataInputStream dataInputStream=new DataInputStream(connection.getInputStream());
            byte[] arr=readMessage(dataInputStream);
            System.out.println("message length ;" + arr.length);
            Utility.writeBytes("/Users/Desktop/Akif.jpeg",arr);



        }
    }



}
