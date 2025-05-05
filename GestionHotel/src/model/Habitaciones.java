package model;
public class Habitaciones {
  
    int NumeroHabitacion;
    String tipohabitacion;
    int capacidad;
    double precionoche;
    String estado;

    public Habitaciones(int NumeroHabitacion, String tipohabitacion, int capacidad,  double precionoche, String estado) {

        this.NumeroHabitacion = NumeroHabitacion;
        this.tipohabitacion = tipohabitacion;
        this.capacidad = capacidad;
        this.precionoche = precionoche;
        this.estado = estado;
    }

    // --- GETTERS Y SETTERS ---

    public int getNumeroHabitacion() {
        return NumeroHabitacion;
    }
    public void setNumeroHabitacion(int NumeroHabitacion) {
        this.NumeroHabitacion = NumeroHabitacion;
    }

    public String getTipoHabitacion(){
        return tipohabitacion;
    }
    public void setTipoHabitacion(String tipohabitacion){
        this.tipohabitacion = tipohabitacion;
    }

    public double getPrecioNoche() {
        return precionoche;
    }
    public void setPrecioNoche(double precionoche) {
        this.precionoche = precionoche;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return String.format("Habitación[ID: %d, Número: %s, Tipo: %s, Precio: %.2f, Estado: %s]",
                id, numerohabitacion, tipohabitacion, precionoche, estado);
    }
}
