public class Coche extends Thread {


    private int velocidadKmH;
    private String nombre;
    private float tiempoCompletarCircuito;
    private int posicion;

    public Coche(int velocidad,String nombre) {
        this.velocidadKmH = velocidad;
        this.nombre  = nombre;
    }


    @Override
    public void run() {
        System.out.println("El "+ nombre + " ha hecho una buena salida.Comienza su carrera.");

        try {

            join((int)tiempoCompletarCircuito*1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("El " + nombre + " cruzado la meta.");
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

}
