public class Empleado {
    private String nombre;
    private String dni;
    private String tipo; // Limpieza, Camarero, Recepcion, Botones
    private double salario;
    private String turno; // Dia, tarde, noche 

    public Empleado(String nombre, String dni, String tipo, int salario, String turno){
        this.nombre = nombre;
        this.dni = dni; 
        this.tipo = tipo;
        this.salario = salario;
        this.turno = turno; 
    }

    // Getters
    public String getNombre(){
        return nombre;
    }

    public String getDni(){
        return dni;
    }

    public String getTipo(){
        return tipo;
    }

    public double  getSalario(){
        return salario;
    }

    public String getTurno(){
        return turno;
    }

    //Stters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setTurno(String turno){
        this.turno = turno;
    }






    
}
