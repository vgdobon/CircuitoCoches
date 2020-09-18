import java.util.ArrayList;
import java.util.List;

public class Circuito {
    List<Coche> coches = new ArrayList<Coche>();
    float longitudKm;
    List<Coche> podio = new ArrayList<Coche>();


    public Circuito(int longitudKm) {

        this.longitudKm = longitudKm;
    }



    public void comenzarCarrera(){
        System.out.println("Pistoletazo de salida");

        for (Coche coche:coches) {
            coche.tiempoCompletarCircuito=longitudKm/coche.velocidadKmH;
        }

        for (Coche coche: coches
             ) {
            coche.start();
        }


        for (int j = 0,k=1; j < coches.size();) {

            for (int i = 0; i < coches.size();i++) {
                if(!coches.get(i).isAlive()){
                    coches.get(i).posicion=k;
                    System.out.println("Posicion:" + (k) + ": " + coches.get(i).nombre );
                    k++;
                    podio.add(coches.get(i));
                    coches.remove(coches.get(i));

                }
            }
        }

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
            System.out.println("Posición " + coche.posicion + ": " + coche.nombre + ".");
        }

    }


    public void inscribirCocheALaCarrera(Coche coche){
        coches.add(coche);
    }
}
