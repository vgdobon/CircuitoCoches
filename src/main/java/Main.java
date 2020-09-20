public class Main {

    public static void main(String[] args) {
        Coche ferrari = new Coche(650,"F430");
        Coche mercedes = new Coche(630,"AMG GT Coupé");
        Coche lamborghini = new Coche( 550,"Huracan");
        Coche audi = new Coche(540,"TT");
        Coche nissan = new Coche(670,"370z Nismo");

        Circuito circuito = new Circuito(30000);

        circuito.inscribirCocheALaCarrera(ferrari);
        circuito.inscribirCocheALaCarrera(mercedes);
        circuito.inscribirCocheALaCarrera(lamborghini);
        circuito.inscribirCocheALaCarrera(audi);
        circuito.inscribirCocheALaCarrera(nissan);

        circuito.comenzarCarrera();
    }

}