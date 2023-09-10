public class BossTehdas extends VaateTehdas {
    @Override
    public Vaate luoFarmarit() {
        return new BossFarmarit();
    }

    @Override
    public Vaate luoTpaita() {
        return new BossTpaita();
    }

    @Override
    public Vaate luoLippis() {
        return new BossLippis();
    }

    @Override
    public Vaate luoKengat() {
        return new BossKengat();
    }
}
