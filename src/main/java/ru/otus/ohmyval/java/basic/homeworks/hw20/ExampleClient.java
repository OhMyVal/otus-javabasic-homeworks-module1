package ru.otus.ohmyval.java.basic.homeworks.hw20;

import java.io.*;

public class ExampleClient implements AutoCloseable {
    private final DataInputStream inputStream; // 1. инициализировали переменные
    private final DataOutputStream outputStream;

    public ExampleClient(InputStream inputStream, OutputStream outputStream) { //2.конструктор создали, в него приходят абстрактные потоки
        this.inputStream = new DataInputStream(inputStream); // 3. создали потоки ввода/вывода
        this.outputStream = new DataOutputStream(outputStream);
    }
    public String readOperation() throws IOException {
        return inputStream.readUTF();


    }

    public void send(String message) throws IOException { // метод будет принимать строчку
        outputStream.writeUTF(message); // отправляет строку на сервер, ждем ответа
        outputStream.flush(); // сливаем данные
        String result = inputStream.readUTF(); // ответ получаем из inputStream, получаем строчку-ответ; здесь ждем ответ от сервера - блокирующая операция
        System.out.println(result); // печатаем результат от сервера
    }

    @Override
    public void close() throws Exception { // после завершения работы клиентское приложение закрываем и вызывается метод close
        inputStream.close(); // закрываем потоки
        outputStream.close();
    }

}
