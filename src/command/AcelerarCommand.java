package command;

public class AcelerarCommand implements Command {

    private Vehiculo vehiculo;

    public AcelerarCommand(Vehiculo vehiculo) {

        this.vehiculo = vehiculo;
    }

    public void ejecutar() {
        vehiculo.acelerar();
    }
}
