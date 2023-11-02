public class Telefono extends Dispositivos {
    String modelo;

    public Telefono(int numero, String dispositivo, String marca, String modelo, String estado, int precio) {
        super(numero, dispositivo, marca, modelo, estado, precio);
        this.modelo = modelo;
    }
}
