import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Light livingRoomLight = new Light();

        // Commands
        Command lightOn = new LightOn(livingRoomLight);
        Command lightOff = new LightOff(livingRoomLight);

        // Remote
        RemoteControl remote = new RemoteControl();

        System.out.println("Enter 1 for switch ON the Lights and 2 for Switch OFF lights");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Turning ON the light:");
                remote.setCommand(lightOn);
                remote.pressButton();
                break;
            case 2:
                System.out.println("\nTurning OFF the light:");
                remote.setCommand(lightOff);
                remote.pressButton();
            default:
                break;
        }

    }
}
