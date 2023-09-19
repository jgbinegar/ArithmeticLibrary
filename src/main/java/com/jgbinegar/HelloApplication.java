package com.jgbinegar;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(DoMathStuff.add(17, 194.6758976));
        System.out.println(DoMathStuff.subtract(147.668, 10256.2));
        System.out.println(DoMathStuff.multiply(76, 102.6897354));
        System.out.println(DoMathStuff.divide(20, 2.5));
    }

    public static void main(String[] args) {
        launch();
    }
}