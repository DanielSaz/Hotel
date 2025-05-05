package model;
public class Clientes{
    String ClienteDni;
    String Nombre;
    String Apellido;
    String Email;
    String Telefono;
    String Direccion;
   
 
    public Clientes(String ClienteDni, String Nombre, String Apellido, String Email, String Telefono, String Direccion) {
        this.ClienteDni = ClienteDni;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
 
    }
 
    // Getters y Setters
    public String getClienteDni() {
        return ClienteDni;
    }
 
    public void setClienteDni(String ClienteDni) {
        this.ClienteDni = ClienteDni;
    }
 
    public String getNombre() {
        return Nombre;
    }
 
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
 
    public String getApellidos() {
        return Apellido;
    }
 
    public void setApellidos(String Apellido) {
        this.Apellido = Apellido;
    }
 
    public String getTelefono() {
        return Telefono;
    }
 
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
 
    public String getEmail() {
        return Email;
    }
 
    public void setEmail(String Email) {
        this.Email = Email;
    }
 
    public String getDireccion() {
        return Direccion;
    }
 
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
 
    @Override
    public String toString() {
        return nombre + " " + apellidos + " (DNI: " + dni + ") - Tel: " + telefono + "email: " + email + "Direccion: " + direccion;
    }
 
}