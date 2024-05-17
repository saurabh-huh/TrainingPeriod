package oops.cityWall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.initializeUsers();
        boolean running = true;
        while (running) {
            String command = sc.nextLine();
            running = socialMedia.executeCommand(command);
        }
    }

}
