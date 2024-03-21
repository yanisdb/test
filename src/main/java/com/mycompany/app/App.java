package com.mycompany.app;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class App {

    public static void main(String[] args) {
        // The file 'example.obj' is assumed to contain a serialized Java object
        String filename = "example.obj";

        try (FileInputStream fileInputStream = new FileInputStream(filename);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            // Deserializing object without any validation
            Object obj = objectInputStream.readObject();

            // Normally, you would do something with the object here
            System.out.println("Deserialized object: " + obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
