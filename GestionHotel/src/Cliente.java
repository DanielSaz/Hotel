public class Cliente {
        private String nombre;
        private boolean conDesayuno;
    
        public Cliente(String nombre, boolean conDesayuno) {
            this.nombre = nombre;
            this.conDesayuno = conDesayuno;
        }
    
        @Override
        public String toString() {
            return nombre + " - Desayuno: " + (conDesayuno ? "Sí" : "No");
        }
    
}
