//Nombre: Ingrid Nina Alessandra Nájera Marakovits
//Carnet: 231088
//Ejercicio 6, POO

public abstract class Dispositivos { // se crea la clase
    int numero; // datos basicos de los dispositivos
    String dispositivo;
    String marca;
    String modelo;
    String estado;
    int precio;

    public Dispositivos(int numero, String dispositivo, String marca, String modelo, String estado, int precio) {
        this.numero = numero; // se hace el constructor
        this.dispositivo = dispositivo;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.estado = estado;
        this.precio = precio;

    }

    public int getNumero() {
        return numero;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getEstado() {
        return estado;
    }

    public int getPrecio() {
        return precio;
    }

    public static void agregar() {
    }

}
