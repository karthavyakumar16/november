package com.neoteric.november.november.transport;

public abstract class TransportCompany  implements TransportInterface{
    protected String companyName;
    protected String vehicleType;

    public TransportCompany(String companyName, String vehicleType) {
        this.companyName = companyName;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "TransportCompany{" +
                "companyName='" + companyName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }

    // Abstract method for companies to implement their own unloading process
    abstract void unloadGoods();

    // Common method
    public void transportDetails() {
        System.out.println("Company: " + companyName + " | Vehicle: " + vehicleType);
    }
}
