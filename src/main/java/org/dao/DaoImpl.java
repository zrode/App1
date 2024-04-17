package org.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version BDD");
        double temp = 24;
        return temp;
    }
}
