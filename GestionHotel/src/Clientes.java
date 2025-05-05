public class Clientes{
    String dni;
    String nombre;
    String apellidos;
    String telefono;
    String email;
    String direccion;
   
 
    public Clientes(String dni, String nombre, String apellidos, String telefono, String email, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
 
    }
 
    // Getters y Setters
    public String getDni() {
        return dni;
    }
 
    public void setDni(String dni) {
        this.dni = dni;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getApellidos() {
        return apellidos;
    }
 
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
 
    public String getTelefono() {
        return telefono;
    }
 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getDireccion() {
        return direccion;
    }
 
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    @Override
    public String toString() {
        return nombre + " " + apellidos + " (DNI: " + dni + ") - Tel: " + telefono + "email: " + email + "Direccion: " + direccion;
    }
 
}