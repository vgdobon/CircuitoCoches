public class Main {

    public static void main(String[] args) {
        Coche ferrari = new Coche(950,"F430");
        Coche mercedes = new Coche(670,"AMG GT Coupé");
        Coche lamborghini = new Coche( 450,"Huracan");
        Coche audi = new Coche(300,"TT");
        Coche nissan = new Coche(750,"370z Nismo");

        Circuito circuito = new Circuito(9000);

        circuito.inscribirCocheALaCarrera(ferrari);
        circuito.inscribirCocheALaCarrera(mercedes);
        circuito.inscribirCocheALaCarrera(lamborghini);
        circuito.inscribirCocheALaCarrera(audi);
        circuito.inscribirCocheALaCarrera(nissan);

        circuito.comenzarCarrera();
    }

}
