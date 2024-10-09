package co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder;


import co.edu.uniquindio.marketplacefx.marketplaceapp.enums.Rol;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Vendedor;

public class VendedorBuilder {
    protected   String nombres;
    protected String apellidos;
    protected String cedula;
    protected String direccion;
    protected String usuario;
    protected String contraseña;
    protected Rol rol;

    public VendedorBuilder nombres(String nombres){
        this.nombres=nombres;
        return this;
    }
    public VendedorBuilder apellidos(String apellidos){
        this.apellidos=apellidos;
        return  this;
    }
    public VendedorBuilder cedula(String cedula){
        this.cedula=cedula;
        return this;
    }
    public VendedorBuilder direccion(String direccion){
        this.direccion=direccion;
        return this;
    }
    public VendedorBuilder usuario(String usuario){
        this.usuario=usuario;
        return this;
    }
    public VendedorBuilder contraseña(String contraseña){
        this.contraseña=contraseña;
        return this;
    }
    public VendedorBuilder rol(Rol rol){
        this.rol=rol;
        return this;
    }
    public Vendedor build(){
        return new Vendedor(nombres, apellidos, cedula, direccion, usuario, contraseña, rol);

    }
}

