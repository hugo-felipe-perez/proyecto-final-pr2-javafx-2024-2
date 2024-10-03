module co.edu.uniquindio.marketplacefx.marketplaceapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mapstruct;

    opens co.edu.uniquindio.marketplacefx.marketplaceapp to javafx.fxml;
    exports co.edu.uniquindio.marketplacefx.marketplaceapp;
    opens co.edu.uniquindio.marketplacefx.marketplaceapp.controller to javafx.fxml;
    exports co.edu.uniquindio.marketplacefx.marketplaceapp.controller;
    opens co.edu.uniquindio.marketplacefx.marketplaceapp.viewcontroller to javafx.fxml;
    



    //opens co.edu.uniquindio.marketplacefx.marketplaceapp.model;
}