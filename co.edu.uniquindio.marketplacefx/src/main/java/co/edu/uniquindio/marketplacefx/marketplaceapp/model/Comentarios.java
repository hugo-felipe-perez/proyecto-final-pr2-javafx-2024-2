package co.edu.uniquindio.marketplacefx.marketplaceapp.model;

public class Comentarios {
    private String comentario;
    private String fecha;
    private String hora;

    public Comentarios() {
    }

    public Comentarios(String comentario, String fecha) {
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
