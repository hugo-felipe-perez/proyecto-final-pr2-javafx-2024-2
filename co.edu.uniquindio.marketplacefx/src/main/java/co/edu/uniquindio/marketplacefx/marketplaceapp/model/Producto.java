package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import java.net.URL;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private URL imagen;

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, double precio, URL imagen) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public URL getImagen() {
        return imagen;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setImagen(URL imagen) {
        this.imagen = imagen;
    }
}
