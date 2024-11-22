package com.neoteric.november.november.transport;

public  class NavataCompany extends TransportCompany {

    public NavataCompany() {

        super("NavataCompany A", "Truck");
    }
    @Override
    public String loadGoods(String goods) {

        return goods;
    }
@Override
    public String deliverGoods() {


        return null;
    }

    @Override
    public void unloadGoods() {
        System.out.println("navata  is unloading goods at the destination.");
    }

    @Override
    public String toString() {
        return "NavataCompany{" +
                "companyName='" + companyName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
