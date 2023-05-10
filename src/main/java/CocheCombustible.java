public class CocheCombustible extends Coche{
    private String tipoCombustible;
    private int capacidadDeposito;

    public void llenarTanque(){
        System.out.println("Llenando el tanque del coche de combustible");
        capacidadDeposito = 100;
    }
}
