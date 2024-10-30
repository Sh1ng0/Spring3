package abstractFactory;

public class DireccionSpainFactory implements DireccionFactory {

    public Direccion crearDireccion(String calle, String ciudad) {
        return new DireccionSpain(calle, ciudad);
    }
}

