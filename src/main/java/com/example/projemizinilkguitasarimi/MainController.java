/**
 * Sample Skeleton for 'hello-view.fxml' Controller Class
 */

package com.example.projemizinilkguitasarimi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private TextField codeText2;

    public void switchToScene1(ActionEvent event ) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage=((Stage) ( (Node)event.getSource()).getScene().getWindow());
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene2(ActionEvent event ) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("start.fxml"));
        stage=((Stage) ( (Node)event.getSource()).getScene().getWindow());
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void SaveAll(ActionEvent event) {
        //Furkan Save Button is Here
    }
    public void saveButton(ActionEvent event )throws IOException{
        MainApplicationa mainApplicationa=new MainApplicationa();
        mainApplicationa.SaveFile(codeText2);
    }

    }

