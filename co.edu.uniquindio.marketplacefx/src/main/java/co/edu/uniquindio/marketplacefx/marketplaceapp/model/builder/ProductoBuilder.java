package co.edu.uniquindio.marketplacefx.marketplaceapp.model.builder;

import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Producto;

import java.net.URL;

public class ProductoBuilder {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private URL imagen;

    public ProductoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public ProductoBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder imagen(URL imagen) {
        this.imagen = imagen;
        return this;
    }

    public Producto build() {
        return new Producto(id,nombre,descripcion,precio,imagen);
    }
}
