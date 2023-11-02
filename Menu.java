import java.io.File;
import java.io.FileNotFoundException; //librerias necesarias
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Dispositivos> dispositivos = new ArrayList<>();

    public Menu(String archivo) {
        try {
            File csv = new File(archivo);
            Scanner leer = new Scanner(csv);

            if (leer.hasNextLine()) {
                leer.nextLine();
            }

            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String[] columna = linea.split(",");
                int numero = Integer.parseInt(columna[0]);
                String dispositivo = columna[1];
                String marca = columna[2];
                String modelo = columna[3];
                String estado = columna[4];
                int precio = Integer.parseInt(columna[5]);

                if (dispositivo.equalsIgnoreCase("telefono")) {
                    Telefono telefono = new Telefono(numero, dispositivo, marca, modelo, estado, precio);
                    dispositivos.add(telefono);
                } else if (dispositivo.equalsIgnoreCase("computadora")) {
                    Computadora computadora = new Computadora(numero, dispositivo, marca, modelo, estado, precio);
                    dispositivos.add(computadora);
                }
            }

            leer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void infodispositivos() {
        if (dispositivos.isEmpty()) {
            System.out.println("No hay dispositivos disponibles.");
        } else {
            System.out.println("Dispositivos Disponibles:");
            for (Dispositivos dispositivo : dispositivos) {
                System.out.println("Número: " + dispositivo.numero);
                System.out.println("Dispositivo: " + dispositivo.dispositivo);
                System.out.println("Marca: " + dispositivo.marca);
                System.out.println("Modelo: " + dispositivo.modelo);
                System.out.println("Estado: " + dispositivo.estado);
                System.out.println("Precio: " + dispositivo.precio + " quetzales");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu("bd.csv");

        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Bienvenido al menú, por favor ingresa una opción:");
            System.out.println("1. Ver Dispositivos");
            System.out.println("2. Agregar Dispositivo");
            System.out.println("3. Ver Estado");
            System.out.println("4. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    menu.infodispositivos();
                    break;

                case 2:
                    // Dispositivos.agregar();
                    break;

                case 3:
                    Electronico.consulta();
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (opcion != 4);

        leer.close();
    }
}
