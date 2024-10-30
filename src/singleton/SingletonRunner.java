import singleton.SingletonUndo;

public class Main {

    public static void main(String[] args) {

        SingletonUndo undoManager = SingletonUndo.getInstance();

        System.out.println("Añadir comandos:");
        undoManager.addCommand();
        undoManager.addCommand();
        undoManager.addCommand();

        System.out.println("Historial:");
        undoManager.showCommads();

        System.out.println("Borrar comandos:");
        undoManager.deleteCommand();

        System.out.println("Historial:");
        undoManager.showCommads();
    }

}
