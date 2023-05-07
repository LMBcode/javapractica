import java.util.Scanner;

public class MenuPrincipal {
    private Joc joc;

    public MenuPrincipal() {
        joc = new Joc();
    }

    public void crearPersonatge(String nom, int PS, int PA, int PD, int PEX) {
        joc.crearPersonatge(nom, PS, PA, PD, PEX);
    }

    public void eliminarPersonatge(int index) {
        joc.eliminarPersonatge(index);
    }

    public void editarPersonatge(int index, String nom, int PS, int PA, int PD, int PEX) {
        joc.modificarPersonatge(index, nom, PS, PA, PD, PEX);
    }

    public void mostrarPersonatges() {
        // Implementa la lógica para mostrar los personajes
    }

    public void iniciarCombate() {
        // Implementa la lógica para iniciar un combate entre dos personajes
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Crear personaje");
            System.out.println("2. Eliminar personaje");
            System.out.println("3. Modificar personaje");
            System.out.println("4. Mostrar personajes");
            System.out.println("5. Iniciar combate");
            System.out.println("6. Salir");
            System.out.print("Introduce una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Crear personaje
                    System.out.print("Introduce el nombre del personaje: ");
                    String nombre = scanner.next();
                    System.out.print("Introduce los puntos de salud (PS): ");
                    int PS = scanner.nextInt();
                    System.out.print("Introduce los puntos de ataque (PA): ");
                    int PA = scanner.nextInt();
                    System.out.print("Introduce los puntos de defensa (PD): ");
                    int PD = scanner.nextInt();
                    System.out.print("Introduce los puntos de experiencia (PEX): ");
                    int PEX = scanner.nextInt();

                    crearPersonatge(nombre, PS, PA, PD, PEX);
                    System.out.println("Personaje creado.");
                    break;
                case 2:
                    // Eliminar personaje
                    System.out.print("Introduce el índice del personaje a eliminar: ");
                    int index = scanner.nextInt();
                    eliminarPersonatge(index);
                    System.out.println("Personaje eliminado.");
                    break;
                case 3:
                    // Modificar personaje
                    System.out.print("Introduce el índice del personaje a modificar: ");
                    int ind = scanner.nextInt();
                    System.out.print("Introduce el nuevo nombre del personaje: ");
                    String nom = scanner.next();
                    System.out.print("Introduce los nuevos puntos de salud (PS): ");
                    int nPS = scanner.nextInt();
                    System.out.print("Introduce los nuevos puntos de ataque (PA): ");
                    int nPA = scanner.nextInt();
                    System.out.print("Introduce los nuevos puntos de defensa (PD): ");
                    int nPD = scanner.nextInt();
                    System.out.print("Introduce los nuevos puntos de experiencia (PEX): ");
                    int nPEX = scanner.nextInt();

                    editarPersonatge(ind, nom, nPS, nPA, nPD, nPEX);
                    System.out.println("Personaje modificado.");
                    break;
                case 4:
                    // Mostrar personajes
                    mostrarPersonatges();
                    break;
                case 5:
                    // Iniciar combate
                    iniciarCombate();
                    break;
                case 6:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, introduce una opción válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }

}
