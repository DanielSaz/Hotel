public class Empleados {
    
    private int dni;
    private String nombre;
    private String apellidos;
    private String puesto; // Limpieza, Camarero, Recepcion, Botones
    private String email;
    private String telefono; 

    public Empleados(int dni, String nombre, String apellidos, String puesto, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre; 
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.email = email; 
        this.telefono = telefono;
    }

    
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getPuesto(){
        return puesto;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto; 
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    

    @Override 
    public String toString() {
        return String.format("Empleado[DNI: %d, Nombre: %s, Apellidos: %s, Puesto: %s, Email: %s, Teléfono: %s]",
                dni, nombre, apellidos, puesto, email, telefono);
    }


    
}
