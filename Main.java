public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Paleta[] paletas = new Paleta[3];
        paletas[0] = new BaseAgua("Fresa", 0.0, true);
        paletas[1] = new BaseCrema("Vainilla", 0.0, true);
        paletas[2] = new BaseAgua("Limon", 0.0, true);
        for (Paleta paleta : paletas) {
            paleta.mostrarInformacion();
            if (paleta instanceof BaseAgua) {
                BaseAgua paletaAgua = (BaseAgua) paleta;
                paletaAgua.mostrarBaseAgua();
            } else if (paleta instanceof BaseCrema) {
                extracted2();
            }
            try {
                paleta.cambiarPrecio(-1);
            } catch (final PrecioInvalidoException e) {
                System.out.println("Error: " + e.getMessage());
            }
            paleta.mostrarInformacion();
            System.out.println();
        }
    }

    private static void extracted2() {
        extracted();
    }

    private static void extracted() {
        BaseCrema.mostrarTexturaCremosa();
    }
}
