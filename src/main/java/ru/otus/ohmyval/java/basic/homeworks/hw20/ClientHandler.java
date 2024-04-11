package ru.otus.ohmyval.java.basic.homeworks.hw20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler {
    private final Socket clientSocket; // переехало из сервера
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ClientHandler(Socket clientSocket, DataInputStream inputStream, DataOutputStream outputStream) {
        this.clientSocket = clientSocket; // задаем в конструкторе
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }
}
