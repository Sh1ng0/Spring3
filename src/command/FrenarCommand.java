package command;

public class FrenarCommand implements Command{

    private Vehiculo vehiculo;


    public FrenarCommand(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void ejecutar(){
        vehiculo.frenar();
    }

}
