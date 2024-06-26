package ru.otus.ohmyval.java.basic.homeworks.hw20;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 8080)) {
                ExampleClient client = new ExampleClient(socket.getInputStream(), socket.getOutputStream());
                System.out.println("Введите операцию из перечисленных: " + client.readOperation() + " и два числа через пробел");
                String userMessage = scanner.nextLine();
                if (userMessage.equals("exit")) {
                    break;
                }
                client.send(userMessage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
