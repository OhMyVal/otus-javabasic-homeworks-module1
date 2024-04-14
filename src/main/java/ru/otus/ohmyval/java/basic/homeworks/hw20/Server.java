package ru.otus.ohmyval.java.basic.homeworks.hw20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080);
        while (true) {
            Socket clientSocket = socket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            outputStream.writeUTF("+ - * /");
            outputStream.flush();
            String userInput = inputStream.readUTF();
            try {
                String result = String.valueOf(count(userInput));
                outputStream.writeUTF(result);
                outputStream.flush();
                System.out.println(result);
            } catch (RuntimeException ex) {
                ex.printStackTrace();
                System.out.println("Неверно введены данные");
                break;
            }
        }
    }


    public static double count(String message) {
        String[] arr = message.split(" ");
        double result;
        double a = Double.parseDouble(arr[1]);
        double b = Double.parseDouble(arr[2]);
        switch (arr[0]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new RuntimeException();
        }
        return result;
    }
}
