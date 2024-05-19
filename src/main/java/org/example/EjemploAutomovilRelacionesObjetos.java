package org.example;

public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setFabricante("Renault");
        auto.setModelo("Megane");
        auto.setColor(Color.GRIS);
        auto.setMotor(new Motor(1.9, TipoMotor.GASOLINA));
        auto.setTipo(TipoAutomovil.SEDAN);

        Motor motorMazda = new Motor(2.1, TipoMotor.DIESEL);
        Estanque estanqueMazda = new Estanque();
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda, estanqueMazda,
                TipoAutomovil.PICKUP);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(2.5,
                TipoMotor.DIESEL), new Estanque(50), TipoAutomovil.HATCHBACK);

        System.out.println(nissan);
        System.out.println(nissan.toString());
        System.out.println(auto);
        System.out.println(auto.getTipo() + " " + auto.getTipo().getDescripcion());

//        System.out.println(auto.detalle());
//        System.out.println(mazda.detalle());
//        System.out.println(nissan.detalle());

        TipoAutomovil tipo = nissan.getTipo();
        System.out.println("tipo nissan: " + tipo.getNombre());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
            case FURGON ->
                System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK ->
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP ->
                System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                System.out.println("Es un automovil más grande, con maletero más grande...");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos) {
            System.out.println(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas());
            System.out.println();
        }
    }
}
