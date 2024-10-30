package abstractFactory;

public class AbstractFactoryRunner /* test Abstract Factory*/ {
    public static void run() {

        AbstractFactory spainFactory = new SpainFactory();

        NumeroTelefonoFactory numeroTelefonoSpainFactory = spainFactory.crearNumeroTelefonoFactory();
        DireccionFactory direccionSpainFactory = spainFactory.crearDireccionFactory();

        NumeroTelefono numeroSpain = numeroTelefonoSpainFactory.crearNumeroTelefono("612345678");
        Direccion direccionSpain = direccionSpainFactory.crearDireccion("Chueca", "Madrid");

        System.out.println("Número de teléfono en España: " + numeroSpain.getNumeroSufijo());
        System.out.println("Dirección en España: " + direccionSpain.getDireccionCompleta());

        AbstractFactory ukFactory = new UKFactory();

        NumeroTelefonoFactory numeroTelefonoUKFactory = ukFactory.crearNumeroTelefonoFactory();
        DireccionFactory direccionUKFactory = ukFactory.crearDireccionFactory();

        NumeroTelefono numeroUK = numeroTelefonoUKFactory.crearNumeroTelefono("07123456789");
        Direccion direccionUK = direccionUKFactory.crearDireccion("Picadilly", "London");

        System.out.println("Número de teléfono UK: "+numeroUK.getNumeroSufijo());
        System.out.println("Dirección de United Kingdm A Bottle o' wa'a: "+ direccionUK.getDireccionCompleta());


    }
}