package com.example.messanger_application;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Protocol {

    public Server() throws Exception {
        ServerSocket server_socket = new ServerSocket(PORT);

        while (true) {
            new ServerTread(server_socket.accept()).start();
        }


    }

    public static void main(String[] args) {
        try {
            new Server();
        } catch (Exception e) {}

    }
}



