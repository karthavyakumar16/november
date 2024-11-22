package com.neoteric.november.november.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ProductTest {
    public static void main(String[] args){
        LinkedList<Product>linkedList=new LinkedList<>();


   Product product1=new Product("watch",3000,"2020");
       Product product2=new Product("mobile",90000,"2022");
        Product product3=new Product("laptop",54000,"2024");

linkedList.add(product1);
        linkedList.add(product2);
        linkedList.add(product3);
      int startingindex=0;
      int endindex=linkedList.size();
        for(startingindex=0;startingindex<endindex;startingindex++){
        Product product= linkedList.get(startingindex);
            System.out.println(product.getName().hashCode());

        }

        linkedList.stream()
                .filter(product -> product.getPrice() > 10000)  .map(product -> product.getName().hashCode())
                .forEach(System.out::println);


linkedList.stream().map(product -> product.getModel().hashCode()).forEach(System.out::println);


        Predicate<Product> expensiveProduct = product -> product.getPrice() > 10000;
        Predicate<Product> recentModel = product -> Integer.parseInt(product.getModel()) > 2021;

        linkedList.stream()
                .filter(expensiveProduct)
                .map(product -> product.getName().hashCode())
                   .forEach(System.out::println);

        linkedList.stream()
                .filter(recentModel)
                .map(product -> product.getModel().hashCode())
                .forEach(System.out::println);

        Iterator<Product> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("Using Iterator - Product Name HashCode: " + product.getName().hashCode());
        }
    }
}
