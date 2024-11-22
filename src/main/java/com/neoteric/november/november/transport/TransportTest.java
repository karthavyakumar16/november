package com.neoteric.november.november.transport;

public class TransportTest {
    public static void main(String[] args) {
        TransportInterface navataCompany = new NavataCompany();
        TransportInterface vrlCompany = new VrlCompany();


        System.out.println( navataCompany.loadGoods("Furniture"));
        System.out.println( navataCompany.deliverGoods());
        ((NavataCompany) navataCompany).unloadGoods();
        ((NavataCompany) navataCompany).transportDetails();

        System.out.println(navataCompany);


        System.out.println( vrlCompany.loadGoods("Electronics"));
        System.out.println( vrlCompany.deliverGoods());
        ((VrlCompany) vrlCompany).unloadGoods();
        ((VrlCompany) vrlCompany).transportDetails();
        System.out.println(vrlCompany);
    }
}
