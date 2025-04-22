public class HotelGestion {
    private List<Habitacion> habitaciones;
    private List<Evento> eventos;
    private Garaje garaje;
    private List<Cliente> clientes;
    private List<Trabajador> trabajadores;

    public HotelGestion() {
        habitaciones = new ArrayList<>();
        eventos = new ArrayList<>();
        garaje = new Garaje();
        clientes = new ArrayList<>();
        trabajadores = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

    public void mostrarHabitaciones() {
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion);
        }
    }

    public void mostrarEventos() {
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }

    public void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void mostrarTrabajadores() {
        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador);
        }
    }

    public static void main(String[] args) {
        HotelGestion hotel = new HotelGestion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Agregar habitación");
            System.out.println("2. Agregar evento");
            System.out.println("3. Agregar cliente");
            System.out.println("4. Agregar trabajador");
            System.out.println("5. Mostrar habitaciones");
            System.out.println("6. Mostrar eventos");
            System.out.println("7. Mostrar clientes");
            System.out.println("8. Mostrar trabajadores");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de la habitación: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el tipo de habitación: ");
                    String tipo = scanner.nextLine();
                    hotel.agregarHabitacion(new Habitacion(numero, tipo));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del evento: ");
                    String nombreEvento = scanner.nextLine();
                    System.out.print("Ingrese la fecha del evento: ");
                    String fechaEvento = scanner.nextLine();
                    hotel.agregarEvento(new Evento(nombreEvento, fechaEvento));
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Ingrese el grupo del cliente: ");
                    String grupoCliente = scanner.nextLine();
                    hotel.agregarCliente(new Cliente(nombreCliente, grupoCliente));
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del trabajador: ");
                    String nombreTrabajador = scanner.nextLine();
                    System.out.print("Ingrese el puesto del trabajador: ");
                    String puestoTrabajador = scanner.nextLine();
                    hotel.agregarTrabajador(new Trabajador(nombreTrabajador, puestoTrabajador));
                    break;
                case 5:
                    hotel.mostrarHabitaciones();
                    break;
                case 6:
                    hotel.mostrarEventos();
                    break;
                case 7:
                    hotel.mostrarClientes();
                    break;
                case 8:
                    hotel.mostrarTrabajadores();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}