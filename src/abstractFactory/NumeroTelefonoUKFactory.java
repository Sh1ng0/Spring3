package abstractFactory;

public class NumeroTelefonoUKFactory implements NumeroTelefonoFactory {

    public NumeroTelefono crearNumeroTelefono(String numero){
        return new NumeroTelefonoUK(numero);
    }


}
