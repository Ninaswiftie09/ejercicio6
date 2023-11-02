public class Computadora extends Dispositivos {
    String marca;

    public Computadora(int numero, String dispositivo, String marca, String modelo, String estado, int precio) {
        super(numero, dispositivo, marca, modelo, estado, precio);
        this.marca = marca;
    }
}