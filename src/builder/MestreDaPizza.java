package builder;

public class MestreDaPizza extends Pizza.PizzaBuilder {

    public MestreDaPizza(float medida, String masa, String ingrediente) {
        super(medida, masa);
        this.ingrediente = ingrediente;
    }

    public Pizza build() {
        return new Pizza(this.medida, this.masa, this.ingrediente);
    }
}
