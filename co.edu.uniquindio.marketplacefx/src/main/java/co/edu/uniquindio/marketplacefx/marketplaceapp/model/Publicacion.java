package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Publicacion {
    private LocalDate fecha;
    private LocalTime hora;
    private int likes;

    public Publicacion(){
    }

    public Publicacion(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
