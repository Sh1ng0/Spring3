package builder;

public class PizzaHawaianaBuilder extends Pizza.PizzaBuilder {

    public PizzaHawaianaBuilder(float medida, String masa) {

        super(medida, masa);
        this.ingrediente = "jamón, piña";
    }

    public Pizza build() {
        return new Pizza(this.medida, this.masa, this.ingrediente);
    }
}
