class AdidasTehdas extends VaateTehdas {

    @Override
    public Vaate luoFarmarit() {
        return new AdidasFarmarit();
    }

    @Override
    public Vaate luoTpaita() {
        return new AdidasTpaita();
    }

    @Override
    public Vaate luoLippis() {
        return new AdidasLippis();
    }

    @Override
    public Vaate luoKengat() {
        return new AdidasKengat();
    }
}