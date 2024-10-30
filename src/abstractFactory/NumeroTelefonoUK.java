package abstractFactory;

public class NumeroTelefonoUK implements NumeroTelefono{

    private String numero;

    public NumeroTelefonoUK(String numero){
        this.numero = numero;
    }

    public String getNumeroSufijo(){
        return "+44 "+ numero;
    }

    public String getNumero() {
        return numero;
    }
}
