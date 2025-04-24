package com.example.pruebas.exceptions;

public class GameException extends Exception {   //Se pueden crear hasta 4 tipos de excepciones.
  public GameException() {
    super();
  }
  public GameException(String message) {
    super(message);
  }
}

/* exc. marcadas = archivos planos. Son las más probables de ocurrir.
  propia = inventada para el juego (que no la tenga runtimeexception).
  no marcada..


  "finally" = para limpiar entradas o salidas. Sí o sí se ejecuta al compilar.
* */