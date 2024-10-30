package builder;

public class Pizza {

    private float medida;
    private String masa;
    private String ingrediente;

    public Pizza(float medida, String masa, String ingrediente) {
        this.medida = medida;
        this.masa = masa;
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "medida=" + medida +
                ", masa='" + masa + '\'' +
                ", ingredientes='" + ingrediente + '\'' +
                '}';
    }

    public static abstract class PizzaBuilder implements IPizza {

        protected float medida;
        protected String masa;
        protected String ingrediente;


        public PizzaBuilder(float medida, String masa) {

            this.medida = medida;
            this.masa = masa;

        }

        public PizzaBuilder() {


        }

        public PizzaBuilder conMedida(float medida) {
            this.medida = medida;
            return this;

        }

        public PizzaBuilder conMasa(String masa) {
            this.masa = masa;
            return this;
        }

        public PizzaBuilder conIngrediente(String ingrediente) {
            this.ingrediente = ingrediente;
            return this;

        }

        public abstract Pizza build();


    }


}
