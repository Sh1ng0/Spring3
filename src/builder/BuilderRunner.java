package builder;

public class BuilderRunner {
    public static void BuilderRunner() {


        Pizza hawaiana = new PizzaHawaianaBuilder(30f, "fina").build();

        System.out.println(hawaiana);

        Pizza barbacoa = new PizzaBarbacoaBuilder(15.5f, "gruesa").build();

        System.out.println(barbacoa);

        Pizza mestre = new MestreDaPizza(16.5f, "normal", "Queso, mayo, maíz, hum...pollo, jamón, MÁS mayo, cartones del horno, plástico, tomate, 3 Olivas").build();
        System.out.println(mestre);

    }

}