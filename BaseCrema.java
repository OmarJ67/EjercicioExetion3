class BaseCrema extends Paleta {
    private static boolean cremosa;

    public BaseCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }

    public static void mostrarTexturaCremosa() {
        System.out.println("Tiene textura cremosa: " + cremosa);
    }

    @Override
    public void cambiarPrecio(double cantidad) {
        if (cantidad < 0) {
            throw new PrecioInvalidoException("La cantidad de cambio de precio no puede ser negativa.");
        }
        setPrecio(getPrecio() + (cantidad + 6)); // Cambio de precio específico para Paletas Crema
    }

    public void otraFuncionalidad() {
        System.out.println("Esta es una funcionalidad adicional de PaletaCrema.");
    }
}
