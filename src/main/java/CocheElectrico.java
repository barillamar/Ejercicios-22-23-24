public class CocheElectrico extends Coche{
    private int capacidadBateria;
    private int autonomia;

    public void cargarBateria(int cantidad) {
        System.out.println("Cargando la batería del coche eléctrico con " + cantidad + " kWh");
        capacidadBateria += cantidad;
    }
}
