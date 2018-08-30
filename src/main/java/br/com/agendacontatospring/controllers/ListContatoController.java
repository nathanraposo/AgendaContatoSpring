package br.com.agendacontatospring.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class ListContatoController implements Initializable {

    @FXML
    private JFXTextField tfPesquisar;

    @FXML
    private JFXButton btBuscar;

    @FXML
    private JFXButton btNovo;

    @FXML
    private JFXTreeTableView<?> tableContato;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
