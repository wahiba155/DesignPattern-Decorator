package Decorateur;

import composants.Boisson;

public class Caramel extends Decorateur {

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override public double cout() {
        return 0.8 + boisson.cout();
    }
    @Override public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }

}
