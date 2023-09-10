import java.lang.reflect.Constructor;

/* Käytä terminaalia:
siirry src kansioon cd src ja syötä komento:
java Main (Boss tai Adidas)
esim. java Main Adidas / java Main Boss */

public class Main {
    public static void main(String[] args) {
        // Tarkistetaan onko komentoriviltä annettu yksi argumentti (tehtaan nimi)
        if (args.length != 1) {
            System.out.println("Anna vaate-tehtaan nimi komentoriviargumenttina");
            return;
        }

        // Tallennetaan saatu tehtaan nimi muuttujaan
        String tehdasNimi = args[0];
        // Luo vaate-tehtaan dynaamisesti nimen perusteella
        VaateTehdas tehdas = luoTehdasDynaamisesti(tehdasNimi);

        if (tehdas == null) {
            System.out.println("Tehdasta " +  tehdasNimi + " ei löytynyt.");
            return;
        }

        Jasper jasper = new Jasper(tehdas);
        jasper.pukeudu();
    }

    private static VaateTehdas luoTehdasDynaamisesti(String tehdasNimi) {
        try {
            // esim "Adidas" + "Tehdas" = AdidasTehdas
            String tehdasLuokkaNimi = tehdasNimi + "Tehdas";

            // lataa luokan nimen perusteella
            Class<?> tehdasLuokka = Class.forName(tehdasLuokkaNimi);

            // hakee luokan konstruktorin (tehtaan luontimetodin)
            Constructor<?> constructor = tehdasLuokka.getDeclaredConstructor();

            // luo uuden vaate-tehtaan
            return (VaateTehdas) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}