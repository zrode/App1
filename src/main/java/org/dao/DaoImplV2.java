package org.dao;

public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double temp = 11;
        return temp;
    }
}
