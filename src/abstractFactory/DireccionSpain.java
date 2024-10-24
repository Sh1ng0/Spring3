package abstractFactory;

public class DireccionSpain implements Direccion {

    private String calle;
    private String ciudad;

    public DireccionSpain(String calle, String ciudad){
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public String getDireccionCompleta(){
        return calle + ", " + ciudad + ", España.";
    }
}
