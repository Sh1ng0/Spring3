package abstractFactory;

public class SpainFactory implements AbstractFactory {
    @Override
    public NumeroTelefonoFactory crearNumeroTelefonoFactory() {
        return new NumeroTelefonoSpainFactory();
    }

    @Override
    public DireccionFactory crearDireccionFactory() {
        return new DireccionSpainFactory();
    }
}