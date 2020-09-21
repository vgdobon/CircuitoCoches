import java.util.ArrayList;
import java.util.List;

public class Circuito{
    List<Coche> coches = new ArrayList<Coche>();
    float longitudKm;
    List<Coche> podio = new ArrayList<Coche>();
    long nVueltas;


    public Circuito(int longitudKm,int vueltas) {

        this.longitudKm = longitudKm;
        this.nVueltas = vueltas;
    }



    public void comenzarCarrera(){
        System.out.println("Pistoletazo de salida.");

        for (Coche coche:coches) coche.setTiempoCompletarCircuito(longitudKm / coche.getVelocidadKmH()) ;

        for (Coche coche: coches
             ) {
            coche.start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Coche coche :
                coches) {
            coche.calcularAccidentes();
        }

        long contadorVueltas=0;
        long contadorIsAlive=0;
        for (int j = 0,k=1; j < coches.size();) {

            for (int i = 0; i < coches.size();i++) {
                if(!coches.get(i).isAlive()){
                    coches.get(i).setPosicion(k);
                    System.out.println("Posicion " + (k) + ": " + coches.get(i).getNombre() );
                    System.out.println("Número de accidentes: " + coches.get(i).getnAccidentes());
                    k++;
                    System.out.println("Tiempo por vuelta: " + ((coches.get(i).getTiempoTotal())/ nVueltas)/1000f + " segundos.");
                    System.out.println("Tiempo total : " + (coches.get(i).getTiempoTotal()/1000f + " segundos\n"));
                    podio.add(coches.get(i));
                    coches.remove(coches.get(i));
                }
                contadorIsAlive++;

            }
            contadorVueltas++;
        }

        System.out.println();
        System.out.println(contadorVueltas+" vueltas del bucle.");
        System.out.println(contadorIsAlive + " vueltas al bucle isAlive()\n");

        podio();

        for (Coche coche:coches) {
            try {
                coche.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Fin de la carrera");
    }

    private void podio() {
        System.out.println("PODIO: \n");

//        for (int j = 0,k=1; j < podio.size();) {
//            for (int i = 0 ; i < podio.size(); i++) {
//                if(podio.get(i).posicion==k){
//                    System.out.println("Posicion:" + (k) + ": " + podio.get(i).nombre );
//                    k++;
//                    podio.remove(podio.get(i));
//                }
//            }
//
//        }

        for (Coche coche :
                podio) {
            System.out.println("Posición " + coche.getPosicion() + ": " + coche.getNombre() + ".");
        }

    }


    public void inscribirCocheALaCarrera(Coche coche){
        coches.add(coche);
    }
}
