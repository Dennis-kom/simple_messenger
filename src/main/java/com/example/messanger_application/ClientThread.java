package com.example.messanger_application;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientThread extends Thread implements Protocol{
    SimpleMessangerController controller;
    Data data;
    public ClientThread(SimpleMessangerController controller, Data data){
        this.controller = controller;
        this.data = data;
    }

    @Override
    public void run(){
        super.run();
        try{ sendMessage(); }
        catch (Exception e){ e.printStackTrace(); }

    }

    private void sendMessage() throws Exception{
        Socket socket = new Socket(SERVER_IP, PORT);


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(this.data.getMessage());

    }
}
