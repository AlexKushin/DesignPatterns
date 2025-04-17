package com.okushyn.patterns.design.creational.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman1 = new Swordsman();
        swordsman1.move(new Point3D(10, 15, 20), 25);
        swordsman1.attack();

        System.out.println(swordsman1);

        Swordsman swordsman2 = (Swordsman) swordsman1.clone();
        System.out.println(swordsman2);
    }

}