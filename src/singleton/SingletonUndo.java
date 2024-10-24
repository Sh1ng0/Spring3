package singleton;

import java.util.ArrayList;
import java.util.Scanner;

public class SingletonUndo {




    private static SingletonUndo instance;


    private static ArrayList<String> commands = new ArrayList<>();

    private SingletonUndo() {
    }

    public static SingletonUndo getInstance() {
        if (instance == null) {
            instance = new SingletonUndo();
        }
        return instance;
    }

    public void addCommand() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su comando:");
        String comando = teclado.nextLine();

        commands.add(comando);

    }

    public void deleteCommand() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Desea eliminar un comando en concreto (C) o todo el historial (H)?");
        String choice = teclado.nextLine();

        switch (choice.toUpperCase()) {

            case "C":
                System.out.println("Indique el índice del comando a eliminar: ");
                int index = teclado.nextInt();
                teclado.nextLine(); // Limpiar el buffer después de nextInt()

                if (index >= 0 && index < commands.size()) {
                    commands.remove(index);
                } else {
                    System.out.println("Índice inválido.");
                }
                break;
            case "H":
                commands.clear();
                System.out.println("Historial borrado, elementos en el historial: " + commands.size());

        }

    }

    public void showCommads() {


        for (int i = 0; i < commands.size(); i++) {
            System.out.println(i + " : " + commands.get(i));
        }


    }
}


