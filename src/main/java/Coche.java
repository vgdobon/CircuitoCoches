public class Coche extends Thread {

    int velocidadKmH;
    String nombre;
    float tiempoCompletarCircuito;
    int posicion;

    public Coche(int velocidad,String nombre) {
        this.velocidadKmH = velocidad;
        this.nombre  = nombre;
    }


    @Override
    public void run() {
        System.out.println("Soy " + nombre + " y empiezo la carrera");

        try {

            join((int)tiempoCompletarCircuito*1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Soy " + nombre + " y he terminado la carrera");
    }


}
