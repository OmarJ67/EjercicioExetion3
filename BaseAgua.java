class BaseAgua extends Paleta {
    private boolean baseAgua;

    public BaseAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    public void mostrarBaseAgua() {
        System.out.println("Tiene base de agua: " + baseAgua);
    }
}