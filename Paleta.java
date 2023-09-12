class PrecioInvalidoException extends RuntimeException {
    public PrecioInvalidoException(String mensaje) {
        super(mensaje);
    }
}
public class Paleta {
private String sabor;
private double precio;
public Paleta(String sabor, double precio) {
this.sabor = sabor;
this.setPrecio(precio);
}
public double getPrecio() {
    return precio;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
public void mostrarInformacion() {
System.out.println("Sabor: " + sabor);
System.out.println("Precio: $" + getPrecio());
}
public void cambiarPrecio(double cantidad) {
setPrecio(getPrecio() + cantidad);
}
}




