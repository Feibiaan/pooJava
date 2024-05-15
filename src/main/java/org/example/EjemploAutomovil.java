package org.example;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setFabricante("Renault");
        auto.setModelo("Megane");
        auto.setColor("Negro");
        auto.setCilindrada(1.9);

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo");
        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        System.out.println(auto.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
    }
}
