package co.edu.uniquindio.marketplacefx.marketplaceapp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MarketplaceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    void onAgregarCliente(ActionEvent event) {
        System.out.println("Agregando Cliente");
    }

    @FXML
    void initialize() {
    }
}
