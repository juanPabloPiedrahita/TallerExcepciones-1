package com.example.pruebas;

import com.example.pruebas.exceptions.VisualException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        try {
            boolean fxmlEncontrado = false;
            if (!fxmlEncontrado) {
                throw new VisualException("Archivo FXML no encontrado en el sistema.");
            }

            System.out.print("Ingrese el número A: ");
            int a = scanner.nextInt();

            System.out.print("Ingrese el número B: ");
            int b = scanner.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre 0.");
        } catch (InputMismatchException e) {
            System.out.println("Error: por favor ingrese solo números enteros.");
        } catch(VisualException e) {
            System.out.println("Error: no se pudo cargar. " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operación finalizada.");
        }
    }
}

/*
                DESARROLLO TALLER EXCEPCIONES.

 * 1. ¿Qué tipo de excepción se lanza?
    R/= Se está lanzando la excepción "ArithmeticException", la cual representa una excepción de tipo No Marcada.

      ¿Qué mensaje muestra en consola?
    R/= El mensaje que se muestra en consola responde a "Caused by: (...) : / by zero", indicando que se lanza la excepción debido a, en este caso, realizar una división con un denominador igual a 0.

 * 2. R/=
        public static void main(String[] args) {
            int a = 10, b = 0;

            try{
                int resultado = a / b;

                System.out.println("Resultado: " + (a / b));
            } catch(ArithmeticException e) {
                System.out.println("Error: no se puede dividir entre 0");
            }
        }
    }

 * 3. R/=
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Ingrese el número A: ");
                int a = scanner.nextInt();

                System.out.print("Ingrese el número B: ");
                int b = scanner.nextInt();

                int resultado = a / b;
                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir entre 0.");
            } catch (InputMismatchException e) {
                System.out.println("Error: por favor ingrese sólo números enteros.");
            }
        }

 * 4. R/=
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Ingrese el número A: ");
                int a = scanner.nextInt();

                System.out.print("Ingrese el número B: ");
                int b = scanner.nextInt();

                int resultado = a / b;
                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir entre 0.");
            } catch (InputMismatchException e) {
                System.out.println("Error: por favor ingrese solo números enteros.");
            } finally {
                scanner.close();
                System.out.println("Operación finalizada.");
            }
        }

 * 5. R/=
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            boolean fxmlEncontrado = false;
            if (!fxmlEncontrado) {
                throw new VisualException("Archivo FXML no encontrado en el sistema.");
            }

            System.out.print("Ingrese el número A: ");
            int a = scanner.nextInt();

            System.out.print("Ingrese el número B: ");
            int b = scanner.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre 0.");
        } catch (InputMismatchException e) {
            System.out.println("Error: por favor ingrese solo números enteros.");
        } catch(VisualException e) {
            System.out.println("Error: no se pudo cargar. " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operación finalizada.");
        }
    }
 */