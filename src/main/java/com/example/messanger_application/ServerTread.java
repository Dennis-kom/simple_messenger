package com.example.messanger_application;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTread extends Thread implements Protocol{

    Socket socket;
    public ServerTread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        super.run();
        try{
            handleReadAndWrite();
        }
        catch (Exception e){
            System.out.println("Debug: " + e.getMessage());
        }
    }

    public void handleReadAndWrite() throws Exception{

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

        String data = (String)objectInputStream.readObject();

        System.out.println(data);


    }

}
