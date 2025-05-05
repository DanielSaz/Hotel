package model;
public class Empleados {
    
    String EmpleadoDni;
    String Nombre;
    String Apellido;
    String Puesto; // Limpieza, Camarero, Recepcion, Botones
    String Email;
    String Telefono; 
    String Jornada;
    int HorasExtra;

    public Empleados(String EmpleadoDni, String Nombre, String Apellido, String Puesto, String Email, String Telefono, String Jornada, int HorasExtra) {
        this.EmpleadoDni = EmpleadoDni;
        this.Nombre = Nombre; 
        this.Apellido = Apellido;
        this.Puesto = Puesto;
        this.Email = Email; 
        this.Telefono = Telefono;
        this.Jornada = Jornada;
        this.HorasExtra = HorasExtra;
    }

    
    public String getEmpleadoDni(){
        return EmpleadoDni;
    }
    public void setEmpleadoDni(String EmpleadoDni){
        this.EmpleadoDni = EmpleadoDni;
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre){
        this.Nombre = Nombre;
    }

    public String getApellido(){
        return Apellido;
    }
    public void setApellidos(String Apellido){
        this.Apellido = Apellido;
    }

    public String getPuesto(){
        return Puesto;
    }
    public void setPuesto(String Puesto){
        this.Puesto = Puesto; 
    }
    
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getTelefono(){
        return Telefono;
    }
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }

    public String getJornada(){
        return Jornada;
    }

    public int getHorasExtra(){
        return HorasExtra;
    }
    public void setHorasExtra(int HorasExtra){
        this.HorasExtra = HorasExtra;
    }

    

    @Override 
    public String toString() {
        return String.format("Empleado[DNI: %d, Nombre: %s, Apellidos: %s, Puesto: %s, Email: %s, Teléfono: %s]",
                dni, nombre, apellidos, puesto, email, telefono);
    }


    
}
