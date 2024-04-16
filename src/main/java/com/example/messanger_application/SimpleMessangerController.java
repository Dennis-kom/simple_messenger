package com.example.messanger_application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class SimpleMessangerController implements Protocol{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cancel_button;

    @FXML
    private Button send_button;

    @FXML
    private TextArea text_area;

    @FXML
    void initialize() {
        assert cancel_button != null : "fx:id=\"cancel_button\" was not injected: check your FXML file 'Untitled'.";
        assert send_button != null : "fx:id=\"send_button\" was not injected: check your FXML file 'Untitled'.";
        assert text_area != null : "fx:id=\"text_area\" was not injected: check your FXML file 'Untitled'.";

    }

    public void send_button_clicked(ActionEvent event){

        new ClientThread(this, new Data(text_area.getText())).start();

    }

}