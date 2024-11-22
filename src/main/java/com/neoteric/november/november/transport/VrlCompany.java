package com.neoteric.november.november.transport;

public  class VrlCompany extends TransportCompany{



    public VrlCompany() {
        super("VrlCompany B", "Ship");
    }
    @Override
    public String loadGoods(String goods) {


        return "Goods loaded: " + goods;
    }

    @Override
    public String deliverGoods() {


        return "goods delivered";
    }

    @Override
    public void unloadGoods() {

        System.out.println("VrlCompany is unloading goods at the port.");
    }

    @Override
    public String toString() {
        return "VrlCompany{" +
                "companyName='" + companyName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
