package org.presentation;

import org.dao.DaoImpl;
import org.dao.IDao;
import org.metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        // Injection des dépendances par instanciation statique
        MetierImpl metier = new MetierImpl();
        IDao dao = new DaoImpl();
        metier.setDao(dao); // injection via le setter
        System.out.println(metier.calcul());
    }

}
