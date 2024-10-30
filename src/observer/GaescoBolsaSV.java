package observer;

public class GaescoBolsaSV implements Observer {

    public void update(String message){
        System.out.println("Gaesco ha recibido la notificación: "+ message);
    }

}
