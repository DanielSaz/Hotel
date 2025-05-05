package Model;

import java.util.Date;

public class Eventos {

    private final int sala = 1;
    private Date fecha;
    private int cantidad;
    private String tipo;
    private boolean catering;
    
    public Eventos(Date fecha, String tipo, boolean catering) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.catering = catering;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getCatering() {
        return this.catering;
    }
    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    public Date getDate() {
        return this.fecha;
    }

    public void setDate(Date fecha) {
        this.fecha = fecha;
    }

}

