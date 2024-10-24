package abstractFactory;

public class UKFactory implements AbstractFactory {
    @Override
    public NumeroTelefonoFactory crearNumeroTelefonoFactory() {
        return new NumeroTelefonoUKFactory();
    }

    @Override
    public DireccionFactory crearDireccionFactory() {
        return new DireccionUKFactory();
    }
}