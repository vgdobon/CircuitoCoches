import java.util.Random;

public class Coche extends Thread {


    private int velocidadKmH;
    private String nombre;
    private float tiempoCompletarCircuito;
    private int posicion;
    private int probabilidadChoque;
    private int nAccidentes;

    public Coche(int velocidad,String nombre) {
        this.velocidadKmH = velocidad;
        this.nombre  = nombre;
        this.probabilidadChoque = velocidad/10;
    }

    @Override
    public void run() {
        System.out.println("El "+ nombre + " ha hecho una buena salida.Comienza su carrera.");

        //Numero aleatorio del 1 al 100



        try {

            join((int)tiempoCompletarCircuito*1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("El " + nombre + " ha cruzado la meta.");
    }

    public void calcularAccidentes(){


        int nAccidentesProbables= new Random().nextInt(3);
        //Posibles opciones: 0  1  2  (accidentes)

        for (int i = 0; i < nAccidentesProbables; i++) {
            int probabilidadAccidente = new Random().nextInt(100);
            //pobabilidad de que en accidente el coche se salga de pista.
            if(probabilidadAccidente<= probabilidadChoque){
                try {
                    System.out.println("\nAccidente->>"+nombre + " se ha salido de pista en su " + (i+1) + " accidente.Ha perdido 10 segundos\n");
                    sleep(10000);
                    nAccidentes++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                System.out.println(nombre + " ha recuperado la trazada en su " + (i+1) + " accidente.Sigue adelante en la carrera.");
            }
        }

    }


    public int getVelocidadKmH() {
        return velocidadKmH;
    }

    public void setVelocidadKmH(int velocidadKmH) {
        this.velocidadKmH = velocidadKmH;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTiempoCompletarCircuito() {
        return tiempoCompletarCircuito;
    }

    public void setTiempoCompletarCircuito(float tiempoCompletarCircuito) {
        this.tiempoCompletarCircuito = tiempoCompletarCircuito;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getnAccidentes() {
        return nAccidentes;
    }


}
