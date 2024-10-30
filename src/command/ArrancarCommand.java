package command;

public class ArrancarCommand implements Command {

    private Vehiculo vehiculo;

    public ArrancarCommand(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void ejecutar() {
        vehiculo.arrancar();
    }

}
