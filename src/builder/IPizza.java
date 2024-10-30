package builder;

public interface IPizza {

    Pizza.PizzaBuilder conMedida(float medida);

    Pizza.PizzaBuilder conMasa(String masa);

    Pizza.PizzaBuilder conIngrediente(String ingrediente);
}
