package br.com.agendacontatospring.controllers;

import br.com.agendacontatospring.Main;
import br.com.agendacontatospring.view.EditContato;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class MainController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void fechaTela(){
        Main.getStage().close();
    }

}
