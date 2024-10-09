package co.edu.uniquindio.marketplacefx.marketplaceapp.controller;


import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasena;

    private Usuario usuarioRegistrado = new Usuario("admin", "12345");

    @FXML
    public void handleLogin() {
        String nombreUsuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        if (usuarioRegistrado.autenticar(nombreUsuario, contrasena)) {
            mostrarAlerta("Login Exitoso", "Bienvenido, " + nombreUsuario, Alert.AlertType.INFORMATION);
        } else {
            mostrarAlerta("Login Fallido", "Usuario o contraseña incorrectos", Alert.AlertType.ERROR);
        }
    }

    private void mostrarAlerta(String titulo, String contenido, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setContentText(contenido);
        alerta.setHeaderText(null);
        alerta.showAndWait();
    }
}
