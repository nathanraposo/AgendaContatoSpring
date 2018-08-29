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


    @FXML
    private TextField tf_pesquisar;

    @FXML
    private Button bt_buscar;

    @FXML
    private Button bt_novo;

    @FXML
    private TableView<?> table_contatos;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bt_novo.setOnMouseClicked((MouseEvent e) -> {
            try {
                EditContato editContato = new EditContato();
                editContato.start(new Stage());
                fechaTela();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });

    }

    public void fechaTela(){
        Main.getStage().close();
    }


    /*@FXML
    private void btnNovo(ActionEvent event) {
        //stageManager.switchScene(FxmlView.USER);

    }*/
}
