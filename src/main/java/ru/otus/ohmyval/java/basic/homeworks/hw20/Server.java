package ru.otus.ohmyval.java.basic.homeworks.hw20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
//    private static final List<ClientHandler> clientHandlers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8080); // 1.создали сокет, указали порт, к кот. он будет привязываться
//        while (true) { // 2. работает в бесконечном цикле, пока не остановим сами - будет слушать.
            Socket clientSocket = socket.accept(); // 3. слушает с пом-ю блокирующего метода accept (бесконечно ждет подключения). Когда кто-то подключается, метод accept завершается, выдается инфо о клиенте
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());// 4.сервер получает данные из InputStream (а клиент их на сервер отправляет)
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());// 5.отправляет ответ в клиентское приложение
//            ClientHandler clientHandler = new ClientHandler(clientSocket, inputStream, outputStream); // 13. создали клиентхэндлера
//            clientHandlers.add(clientHandler); // 15. добавили в лист нашего clientHandler

            outputStream.writeUTF("+ - * /");
            outputStream.flush();

            String userInput = inputStream.readUTF();
            String result = String.valueOf(count(userInput));
            outputStream.writeUTF(result);
            outputStream.flush();
            System.out.println(result);

//            String userInput = inputStream.readUTF();//7. считали стррчку, кот. пришла от пользователя
//            System.out.println(userInput);// 8. распечатали ее
//            String result = transform(userInput); //9. передали в метод transform
//            outputStream.writeUTF(result); // 10. отдаем обратно пользователю - запихнем в метод writeUTF()
//            outputStream.flush(); // 11. сливаем данные пользователю что бы ни случилось
//            System.out.println(result); // 12 распечатали ее
        }

//    }

    public static int count(String message) {
        String[] arr = message.split(" ");
//        char ch = arr[0].charAt(0);
        int result;
        int a = Integer.parseInt(arr[1]);
        int b = Integer.parseInt(arr[2]);
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
            default: throw new RuntimeException();
        }
        return result;
    }
}
