package org.metier;

import org.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    @Override
    public double calcul() {
        double temp = dao.getData();
        return temp*2;
    }

    // Permet d'injecter un objet qui implémente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
