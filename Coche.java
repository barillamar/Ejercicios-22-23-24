public class Coche {
    public int velocidad;
    public boolean luces;
    public boolean bateria;

    public boolean revisarBateria() {
        if (!bateria) {
            System.out.println("La batería está apagada");
        }
        System.out.println("La batería está apagada");
        return true;
    }

}
 class Motor extends Coche implements Funcionalidad {

     @Override
     public void encenderLuces() {}
     @Override
     public void apagarLuces() {}

     @Override
     public void acelerar() {
         velocidad++;
     }
     @Override
     public void frenar() {
         velocidad--;
     }
     @Override
     public int obtenerVelocidad() {
         return velocidad;
     }

 }

 class Luces extends Coche implements Funcionalidad {

    @Override
     public void encenderLuces() {
         if (!revisarBateria()) {
             System.out.println("Enciende la bateria primero");
         }
         System.out.println("Encendiendo las luces...");
         System.out.println("Luces encendidas.");
     }
     @Override
     public void apagarLuces() {
         if (!luces) {
             System.out.println("Las luces ya se encuentran apagadas");
         }
         System.out.println("Apagando las luces...");
         System.out.println("Luces apagadas.");
     }

     @Override
     public void acelerar() {

     }

     @Override
     public void frenar() {

     }

     @Override
     public int obtenerVelocidad() {
         return 20;
     }
 }