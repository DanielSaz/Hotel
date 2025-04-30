package View;
import java.util.*;

import Model.Cliente;
import Model.Garaje;

import java.time.LocalDate;

public class GestionHotel {
    // Listas para gestionar todas las entidades
    private List<Habitacion> habitaciones;
    private List<Evento> eventos;
    private Garaje garaje;
    private List<Cliente> clientes;
    private List<Trabajador> trabajadores;
    private Scanner scanner;

    public GestionHotel() {
        habitaciones = new ArrayList<>();
        eventos = new ArrayList<>();
        garaje = new Garaje(50); // Capacidad para 50 vehículos
        clientes = new ArrayList<>();
        trabajadores = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Menú principal interactivo
    public void ejecutarSistema() {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1: gestionarHabitaciones(); break;
                case 2: gestionarEventos(); break;
                case 3: gestionarClientes(); break;
                case 4: gestionarTrabajadores(); break;
                case 5: gestionarGaraje(); break;
                case 0: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción no válida");
            }
        } while (opcion != 0);
        scanner.close();
    }

    private void mostrarMenuPrincipal() {
        System.out.println("\nSISTEMA DE GESTIÓN HOTELERA");
        System.out.println("1. Gestión de Habitaciones");
        System.out.println("2. Gestión de Eventos");
        System.out.println("3. Gestión de Clientes");
        System.out.println("4. Gestión de Trabajadores");
        System.out.println("5. Gestión de Garaje");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Submenús para cada módulo
    private void gestionarHabitaciones() {
        System.out.println("\nGESTIÓN DE HABITACIONES");
        System.out.println("1. Añadir habitación");
        System.out.println("2. Reservar habitación");
        System.out.println("3. Liberar habitación");
        System.out.println("4. Mostrar todas");
        System.out.print("Opción: ");
        
        switch (scanner.nextInt()) {
            case 1:
                System.out.print("Número: ");
                int num = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tipo (Individual/Doble/Suite): ");
                String tipo = scanner.nextLine();
                System.out.print("Precio por noche: ");
                double precio = scanner.nextDouble();
                agregarHabitacion(new Habitacion(num, tipo, precio));
                break;
            case 2:
                System.out.print("Número de habitación a reservar: ");
                reservarHabitacion(scanner.nextInt());
                break;
            case 4:
                mostrarHabitaciones();
                break;
        }
    }

    
        // Métodos para mostrar listados
        public void mostrarHabitaciones() {
            System.out.println("\nLISTADO DE HABITACIONES:");
            if (habitaciones.isEmpty()) {
                System.out.println("No hay habitaciones registradas.");
                return;
            }
            System.out.printf("%-10s %-15s %-10s %-10s%n", "Número", "Tipo", "Precio", "Estado");
            for (Habitacion h : habitaciones) {
                System.out.printf("%-10d %-15s %-10.2f %-10s%n", 
                    h.getNumero(), h.getTipo(), h.getPrecio(), 
                    h.isOcupada() ? "Ocupada" : "Disponible");
            }
        }
    
        public void mostrarEventos() {
            System.out.println("\nEVENTOS PROGRAMADOS:");
            if (eventos.isEmpty()) {
                System.out.println("No hay eventos programados.");
                return;
            }
            for (Evento e : eventos) {
                System.out.println("- " + e.getNombre() + " (Fecha: " + e.getFecha() + ")");
            }
        }
    

    // Método para reservar habitación
    public boolean reservarHabitacion(int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero && !h.isOcupada()) {
                h.reservar();
                System.out.println("✅ Habitación " + numero + " reservada con éxito");
                return true;
            }
        }
        System.out.println("❌ No se pudo reservar la habitación");
        return false;
    }

    public static void main(String[] args) {
        new HotelGestion().ejecutarSistema();
    }
}

// Clases del modelo (deben estar en archivos separados)
class Habitacion {
    private int numero;
    private String tipo;
    private double precio;
    private boolean ocupada;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }
    // Getters y setters...
}

class Garaje {
    private int capacidad;
    public Garaje(int capacidad) { this.capacidad = capacidad; }
}

class Trabajador {
    private String nombre;
    private String puesto;
    private double salario;
    public Trabajador(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    // Getters...
}