package observer;

public class ObserverRunner {
    public static void ObserverRunner(){

        /*Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa
         *(Observers) canvis quan la Borsa puja o baixa.

         *És necessari que l'objecte Observable mantingui referències als Observers.*/

        AgenteDeBolsa juanito = new AgenteDeBolsa();

        Observer gaesco = new GaescoBolsaSV();
        Observer degiro = new DEGIRO();

        juanito.attach(gaesco);
        juanito.attach(degiro);

        juanito.setState("Ojo, que sube el pan");

        /*método notify observers*/
        juanito.notifyObservers();

        System.out.println("Detach observer B");
        juanito.detach(degiro);

        juanito.setState("Nos vamos a Mallorca");


    }
}