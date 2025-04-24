package com.example.pruebas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/


    }


    public static void main(String[] args) {
        int a = 10, b = 0;

        try{
            int resultado = a / b;

            System.out.println("Resultado: " + (a / b));
        } catch(ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre 0");
        }

        //launch();
    }
}

/*
                DESARROLLO TALLER EXCEPCIONES.

 * 1. ¿Qué tipo de excepción se lanza?
    R/= Se está lanzando la excepción "ArithmeticException", la cual representa una excepción de tipo No Marcada.

      ¿Qué mensaje muestra en consola?
    R/= El mensaje que se muestra en consola responde a "Caused by: (...) : / by zero", indicando que se lanza la excepción debido a, en este caso, realizar una división con un denominador igual a 0.

 * 2.
 */