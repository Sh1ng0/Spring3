package observer;

public class DEGIRO implements Observer {

  public void update(String message){
      System.out.println("DEGIRO ha recibido la notificación: "+ message);
  }




}
