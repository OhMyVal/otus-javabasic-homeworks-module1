package ru.otus.ohmyval.java.basic.homeworks.hw20;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //3. создали сканер
        while (true) { //8. На каждой итерации цикла пересоздаем клиентский сокет и клиента
            try (Socket socket = new Socket("localhost", 8080)) { //1. созд. обычный сокет, поместили в трай с ресурсами, чтобы потом он закрылся
                ExampleClient client = new ExampleClient(socket.getInputStream(), socket.getOutputStream());// 2.создали экземпляр нашего клиента, подаем потоки ввода/вывода - берем их из сокета клиента
                System.out.println("Enter message:"); //4. запрашиваем сообщение у пользователя
                String userMessage = scanner.nextLine(); //5. считываем сообщение от пользователя
                if (userMessage.equals("exit")) { // 7. добавляем breake, если клиент вводит exit
                    break;
                }
                client.send(userMessage);//6. отправляем это сообщение на сервер: вызываем у клиента метод send
            } catch(IOException e){ // 2. ошибки в input/outputStream
                throw new RuntimeException(e);
            }
        }

    }
}
