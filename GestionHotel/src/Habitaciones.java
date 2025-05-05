public class Habitaciones {
    
    private int id;  // Individual, Doble, Suite, Familiar 
    private String numerohabitacion;
    private String tipohabitacion;
    private double precionoche;
    private String estado;

    public Habitaciones(int id, String numerohabitacion, String tipohabitacion, double precionoche, String estado) {
        this.id = id;
        this.numerohabitacion = numerohabitacion;
        this.tipohabitacion = tipohabitacion;
        this.precionoche = precionoche;
        this.estado = estado;
    }

    // --- GETTERS Y SETTERS ---
    
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public String getNumeroHabitacion() {
        return numerohabitacion;
    }
    public void setNumeroHabitacion(String numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
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
