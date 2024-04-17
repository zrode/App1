package org.metier;

import org.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    public MetierImpl() {
    }

    // Permet d'injecter un objet qui implémente l'interface IDao via le constructeur
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp*2;
    }

    // Permet d'injecter un objet qui implémente l'interface IDao via le setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
