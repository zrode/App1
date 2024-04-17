package org.presentation;

import org.dao.DaoImpl;
import org.dao.IDao;
import org.metier.MetierImpl;

public class PresentationV2 {
    public static void main(String[] args) {
        // Injection des dépendances par instanciation statique
        IDao dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao); // injection via le constructeur que j'ai ajouté à MetierImpl
        System.out.println(metier.calcul());
    }
}
