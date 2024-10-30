package abstractFactory;

public class NumeroTelefonoSpainFactory implements NumeroTelefonoFactory{

    public NumeroTelefono crearNumeroTelefono (String numero){
        return new NumeroTelefonoSpain(numero);
    }
}

