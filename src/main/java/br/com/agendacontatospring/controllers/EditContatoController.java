package br.com.agendacontatospring.controllers;

import br.com.agendacontatospring.Main;
import br.com.agendacontatospring.view.EditContato;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class EditContatoController implements Initializable {

    @FXML
    private TextField tf_id;

    @FXML
    private TextField tf_nome;

    @FXML
    private Button bt_cancelar;

    @FXML
    private Button bt_salvar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        bt_cancelar.setOnMouseClicked(event -> {
            try {
                Main main = new Main();
                main.init();
                main.start(new Stage());

                fechaTela();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    }


    public void fechaTela() {
        EditContato.getStage().close();
    }
}
