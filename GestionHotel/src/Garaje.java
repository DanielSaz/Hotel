import java.util.HashMap;
import java.util.Map;

public class Garaje {
    private int capacidadMaxima;
    private Map<String, Integer> registroVehiculos; 
    private Map<Integer, String> registroHabitaciones; 

    public Garaje(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.registroVehiculos = new HashMap<>();
        this.registroHabitaciones = new HashMap<>();
    }

    // Registrar vehículo asociado a una habitación
    public boolean registrarVehiculo(String matricula, int numeroHabitacion) {
        if (registroVehiculos.size() >= capacidadMaxima) {
            System.out.println("Garaje lleno. No se puede registrar el vehículo.");
            return false;
        }
        
        if (registroVehiculos.containsKey(matricula)) {
            System.out.println("Este vehículo ya está registrado.");
            return false;
        }
        
        registroVehiculos.put(matricula, numeroHabitacion);
        registroHabitaciones.put(numeroHabitacion, matricula);
        System.out.println("Vehículo " + matricula + " registrado para habitación " + numeroHabitacion);
        return true;
    }

    // Retirar vehículo 
    public boolean retirarVehiculo(int numeroHabitacion) {
        String matricula = registroHabitaciones.get(numeroHabitacion);
        if (matricula != null) {
            registroVehiculos.remove(matricula);
            registroHabitaciones.remove(numeroHabitacion);
            System.out.println("✅ Vehículo " + matricula + " retirado (Habitación " + numeroHabitacion + ")");
            return true;
        }
        System.out.println("No hay vehículo registrado para esta habitación");
        return false;
    }

    // Consultar vehículo por habitación
    public String consultarVehiculo(int numeroHabitacion) {
        return registroHabitaciones.getOrDefault(numeroHabitacion, "No registrado");
    }

    // Consultar habitación por matrícula
    public Integer consultarHabitacion(String matricula) {
        return registroVehiculos.get(matricula);
    }

    // Mostrar estado actual del garaje
    public void mostrarEstado() {
        System.out.println("\n ESTADO DEL GARAJE");
        System.out.println("Plazas ocupadas: " + registroVehiculos.size());
        System.out.println("Plazas disponibles: " + (capacidadMaxima - registroVehiculos.size()));
        
        System.out.println("\n REGISTRO DE VEHÍCULOS:");
        if (registroVehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados");
        } else {
            System.out.printf("%-15s %-15s%n", "Matrícula", "Habitación");
            for (Map.Entry<String, Integer> entry : registroVehiculos.entrySet()) {
                System.out.printf("%-15s %-15d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
