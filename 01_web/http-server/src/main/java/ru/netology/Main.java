package ru.netology;

import java.io.*;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Server newServer=new Server(9999);
    Server newServer1=new Server(9998);
  }
}


