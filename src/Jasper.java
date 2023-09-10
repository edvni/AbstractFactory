public class Jasper {

    private final Vaate farmarit;
    private final Vaate tpaita;
    private final Vaate lippis;
    private final Vaate kengat;

    public Jasper(VaateTehdas tehdas) {
        farmarit = tehdas.luoFarmarit();
        tpaita = tehdas.luoTpaita();
        lippis = tehdas.luoLippis();
        kengat = tehdas.luoKengat();
    }

    public void pukeudu() {
        System.out.println("Jasperilla on nyt päällä: ");
        System.out.println("Farmarit: " + farmarit);
        System.out.println("T-paita: " + tpaita);
        System.out.println("Lippis: " + lippis);
        System.out.println("Kengät: " + kengat);
    }
}
