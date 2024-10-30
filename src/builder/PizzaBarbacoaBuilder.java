package builder;

public class PizzaBarbacoaBuilder extends Pizza.PizzaBuilder {

    public PizzaBarbacoaBuilder(float medida, String masa) {
        super(medida, masa);
        this.ingrediente = "pollo,salsa barbacoa";

    }

    public Pizza build() {
        return new Pizza(this.medida, this.masa, this.ingrediente);

    }
}


