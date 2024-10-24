package command;

public class CommandRunner {
    public  void CommandRunner() {

        /*Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell.

         *Mostra com funciona el patró Command que implementa
         *els mètodes arrencar, accelerar i frenar per a cada tipus de vehicle.*/

        Control control = new Control();
        Vehiculo coche = new Coche();
        Vehiculo bici = new Bicicleta();
        Vehiculo barco = new Barco();
        Vehiculo avion = new Avion();

        Command acelerar = new AcelerarCommand(coche);
        Command arrancar = new ArrancarCommand(coche);

        Command acelerarBici = new AcelerarCommand(bici);
        control.setCommand(acelerarBici);

        control.boton();


    }
}