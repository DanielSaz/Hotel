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
        public boolean  registrarVehiculo(Garaje garaje, String matricula) {
            if (garaje.registrarVehiculo(matricula, this.numeroHabitacion)) {
                this.numeroMatricula = matricula;
                return true; 
            }
                return false;
        }

        //Metodo para liberar plaza de Garaje
        public void liberarVehiculo(Garaje garaje) {
            if (numeroMatricula != null) {
                garaje.retirarVehiculo(this.numeroHabitacion);
                this.numeroMatricula = null;
            }
        }

        public void getNombre(){
            
        }
    
        @Override
        public String toString() {
            return nombre + " - Desayuno: " + (conDesayuno ? "Sí" : "No");
        }
    
}
