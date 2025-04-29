public class Cliente {
        private String nombre;
        private boolean conDesayuno;
        private int numeroHabitacion;
        private String numeroMatricula;
    
        public Cliente(String nombre, boolean conDesayuno) {
            this.nombre = nombre;
            this.conDesayuno = conDesayuno;
            this.numeroHabitacion = numeroHabitacion;
            this.numeroMatricula = numeroMatricula;
        }
        //Metodo para registrar un vehiculo en el garaje 
        public void registrarVehiculo(Garaje garaje, String matricula) {
            if (garaje.registrarVehiculo(matricula, this.numeroHabitacion)) {
                this.matriculaVehiculo = matricula;
                System.out.println("Vehículo registrado correctamente");
            } else {
                System.out.println("No se pudo registrar el vehículo");
            }
            
        }
        //Metodo para liberar plaza de Garaje
        public void liberarVehiculo(Garaje garaje) {
            if (matriculaVehiculo != null) {
                garaje.retirarVehiculo(this.numeroHabitacion);
                this.matriculaVehiculo = null;
            }
        }

        public void getNombre(){

        }
    
        @Override
        public String toString() {
            return nombre + " - Desayuno: " + (conDesayuno ? "Sí" : "No");
        }
    
}
