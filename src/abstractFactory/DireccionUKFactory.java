package abstractFactory;

public class DireccionUKFactory implements DireccionFactory {
    @Override
    public Direccion crearDireccion(String street, String city) {
        return new DireccionUK(street, city);
    }
}