package org.example;

public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        Persona conductorAuto = new Persona("Lalo", "Martinez");
        Rueda[] ruedasAuto = new Rueda[5];
        for (int i = 0; i < ruedasAuto.length; i++) {
            auto.addRueda(new Rueda("Yokohama", 16, 7.5));
        }
//        ruedasAuto[0] = new Rueda("Yokohama", 16, 7.5);
//        ruedasAuto[1] = new Rueda("Yokohama", 16, 7.5);
//        ruedasAuto[2] = new Rueda("Yokohama", 16, 7.5);
//        ruedasAuto[3] = new Rueda("Yokohama", 16, 7.5);
//        ruedasAuto[4] = new Rueda("Yokohama", 16, 7.5);
        auto.setFabricante("Renault");
        auto.setModelo("Megane");
        auto.setColor(Color.GRIS);
        auto.setMotor(new Motor(1.9, TipoMotor.GASOLINA));
        auto.setTipo(TipoAutomovil.SEDAN);
        auto.setConductor(conductorAuto);
//        auto.setRuedas(ruedasAuto);

        Persona pato = new Persona("Pato", "Rodriguez");
        Rueda[] ruedasMaz = new Rueda[5];
//                {new Rueda("Michelin", 18, 10.5),
//                new Rueda("Michelin", 18, 10.5),
//                new Rueda("Michelin", 18, 10.5),
//                new Rueda("Michelin", 18, 10.5)};


        Motor motorMazda = new Motor(2.1, TipoMotor.DIESEL);
        Estanque estanqueMazda = new Estanque();
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda, estanqueMazda,
                pato, null);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setRuedas(ruedasMaz);

        for (int i = 0; i < ruedasMaz.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        Persona bea = new Persona("Bea", "Gonzalez");
        Rueda[] ruedasNissan = new Rueda[5];
//                {new Rueda("Pirelli", 20, 11.5),
//                new Rueda("Pirelli", 20, 11.5),
//                new Rueda("Pirelli", 20, 11.5),
//                new Rueda("Pirelli", 20, 11.5),
//                new Rueda("Pirelli", 20, 11.5)};


        Automovil nissan = new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(2.5,
                TipoMotor.DIESEL), new Estanque(50), bea, ruedasNissan);
        nissan.setTipo(TipoAutomovil.HATCHBACK);

        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));


        TipoAutomovil tipo = nissan.getTipo();

        System.out.println(auto.verDetalle());

//        System.out.println("Conductor auto: " + auto.getConductor());
//        System.out.println("Ruedas auto");
//        for (Rueda r: auto.getRuedas()) {
//            System.out.println(r.getFabricante() + ", aro: "+ r.getAro() + ", ancho: " + r.getAncho());
//        }
    }
}
