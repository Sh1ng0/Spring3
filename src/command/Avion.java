package command;

public class Avion implements Vehiculo {

    public void arrancar(){

        System.out.println("Pasajeroas, abróchense los cinturones...");
    }

    public void acelerar(){

        System.out.println("El avión acelera");
    }

    public void frenar(){

        System.out.println("Estamos a punto de aterrizar en Tenerife");
    }
}
