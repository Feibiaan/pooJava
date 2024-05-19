package org.example;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setFabricante("Renault");
        auto.setModelo("Megane");
        auto.setColor(Color.GRIS);
        auto.setCilindrada(1.9);
        auto.setTipo(TipoAutomovil.SEDAN);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.AMARILLO, 3.5, 50);

        System.out.println(nissan);
        System.out.println(nissan.toString());
        System.out.println(auto);
        System.out.println(auto.getTipo() + " " + auto.getTipo().getDescripcion());

//        System.out.println(auto.detalle());
//        System.out.println(mazda.detalle());
//        System.out.println(nissan.detalle());
    }
}
