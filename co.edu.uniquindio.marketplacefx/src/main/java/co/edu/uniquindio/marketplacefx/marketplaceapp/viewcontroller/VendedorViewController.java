package co.edu.uniquindio.marketplacefx.marketplaceapp.viewcontroller;
import co.edu.uniquindio.marketplacefx.marketplaceapp.controller.VendedorController;
import co.edu.uniquindio.marketplacefx.marketplaceapp.mapping.dto.VendedorDTO;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VendedorViewController {
    VendedorController vendedorController;
    ObservableList<VendedorDTO> listaVendedor = FXCollections.observableArrayList();
    VendedorDTO vendedorSeleccionado;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private TableColumn<VendedorDTO, String> tcNombre;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TableView<VendedorDTO> tableUsuarios;

    @FXML
    private TableColumn<VendedorDTO, String> tcApellidos;

    @FXML
    private Button btnAgregar;

    @FXML
    private TableColumn<VendedorDTO, String> tcContrasena;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtNombre;

    @FXML
    private TableColumn<VendedorDTO, String> tcCedula;

    @FXML
    private TableColumn<VendedorDTO, String> tcDireccion;

    @FXML
    private Button btnEliminar;

    @FXML
    private TableColumn<VendedorDTO, String> tcUsuario;

    @FXML
    private Button btnActualizar;

    @FXML
    void initialize() {
        vendedorController = new VendedorController();
        initView();
    }

    private void initView() {
        initDataBinding();
        obtenerVendedor();
        tableUsuarios.getItems().clear();
        tableUsuarios.setItems(listaVendedor);
        listenerSelection();
    }

    private void obtenerVendedor() {
        listaVendedor.addAll(vendedorController.obtenerVendedor());
    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombres()));
        tcApellidos.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().apellidos()));
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula()));
        tcDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().direccion()));
        tcUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().usuario()));
        tcContrasena.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().contrasena()));
    }

    private void listenerSelection() {
        tableUsuarios.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            vendedorSeleccionado = newSelection;
            mostrarInformacionVendedor(vendedorSeleccionado);
        });
    }

    private void mostrarInformacionVendedor(VendedorDTO vendedorSeleccionado) {
        if (vendedorSeleccionado != null) {
            txtNombre.setText(vendedorSeleccionado.nombres());
            txtApellidos.setText(vendedorSeleccionado.apellidos());
            txtCedula.setText(vendedorSeleccionado.cedula());
            txtDireccion.setText(vendedorSeleccionado.direccion());
            txtUsuario.setText(vendedorSeleccionado.usuario());
            txtContrasena.setText(vendedorSeleccionado.contrasena());
        }
    }

    @FXML
    void onAgregarUsuario(ActionEvent event) {
        VendedorDTO nuevoVendedor = new VendedorDTO(
                txtNombre.getText(),
                txtApellidos.getText(),
                txtCedula.getText(),
                txtDireccion.getText(),
                txtUsuario.getText(),
                txtContrasena.getText()
        );

        // Llama al método de agregar del controlador
        vendedorController.agregarVendedor(nuevoVendedor);

        // Actualiza la vista, tal vez refrescando una lista o mostrando un mensaje
        refreshVendedoresList();
    }

    @FXML
    void onActualizarUsuario(ActionEvent event) {
        VendedorDTO vendedorActualizado = new VendedorDTO(
                txtNombre.getText(),
                txtApellidos.getText(),
                txtCedula.getText(),
                txtDireccion.getText(),
                txtUsuario.getText(),
                txtContrasena.getText()
        );

        // Llama al método de actualizar del controlador
        vendedorController.actualizarVendedor(vendedorActualizado);

        refreshVendedoresList();
    }

    @FXML
    void onEliminarUsuario(ActionEvent event) {
        String cedula = txtCedula.getText(); // O de otro campo que almacene la cédula del vendedor a eliminar
        vendedorController.eliminarVendedor(cedula);

        refreshVendedoresList();
    }
    private void refreshVendedoresList() {
        listaVendedor.clear();
        listaVendedor.addAll(vendedorController.obtenerVendedor());
        tableUsuarios.setItems(listaVendedor);
    }
}
