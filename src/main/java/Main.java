public class Main {

    public static void main(String[] args) {
        Coche ferrari = new Coche(250,"F430");
        Coche mercedes = new Coche(430,"AMG GT Coupé");
        Coche lamborghini = new Coche( 350,"Huracan");
        Coche audi = new Coche(390,"TT");
        Coche nissan = new Coche(270,"370z Nismo");

        Circuito circuito = new Circuito(8000);

        circuito.inscribirCocheALaCarrera(ferrari);
        circuito.inscribirCocheALaCarrera(mercedes);
        circuito.inscribirCocheALaCarrera(lamborghini);
        circuito.inscribirCocheALaCarrera(audi);
        circuito.inscribirCocheALaCarrera(nissan);

        circuito.comenzarCarrera();
    }

}