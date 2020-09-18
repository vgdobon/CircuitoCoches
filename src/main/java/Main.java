public class Main {

    public static void main(String[] args) {
        Coche ferrari = new Coche(650,"F430");
        Coche mercedes = new Coche(500,"AMG GT Coupé");
        Coche lamborghini = new Coche( 550,"Huracan");

        Circuito circuito = new Circuito(10000);

        circuito.inscribirCocheALaCarrera(ferrari);
        circuito.inscribirCocheALaCarrera(mercedes);
        circuito.inscribirCocheALaCarrera(lamborghini);

        circuito.comenzarCarrera();
    }

}
