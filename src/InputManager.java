import  java.util.Scanner;
public enum InputManager {
    INSTANCE;




    private Scanner scanner;

    public String getScanner(){
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
