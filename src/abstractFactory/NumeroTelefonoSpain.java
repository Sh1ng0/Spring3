package abstractFactory;

public class NumeroTelefonoSpain implements NumeroTelefono {

    private String numero;

    public NumeroTelefonoSpain(String numero){
        this.numero = numero;
    }

    public String getNumeroSufijo(){

        return "+34 "+ numero;
    }

    public String getNumero(){
        return numero;
    }
}
