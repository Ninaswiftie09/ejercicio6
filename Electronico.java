import java.util.Scanner;

public class Electronico extends Dispositivos {
    private static int numero;
    private static String estado;

    public Electronico(int numero, String dispositivo, String marca, String modelo, String estado, int precio) {
        super(numero, dispositivo, marca, modelo, estado, precio);
    }

    public static void consulta() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el número del dispositivo que desea consultar: ");
        int opcion = leer.nextInt();

        if (opcion == numero) {
            System.out.println("Su dispositivo se encuentra " + estado);
        } else {
            System.out.println("No se encontró un dispositivo número " + opcion);
        }
        leer.close();
    }
}
