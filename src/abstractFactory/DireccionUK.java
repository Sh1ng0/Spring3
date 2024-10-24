package abstractFactory;

public class DireccionUK implements Direccion {

    private String calle;
    private String ciudad;

    public DireccionUK(String calle, String ciudad){

        this.calle = calle;
        this.ciudad = ciudad;
    }

    @Override
    public String getDireccionCompleta() {
        return calle + ", " + ciudad + ", United Kingdom. ";
    }
}
