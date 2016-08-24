package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override public void start(Stage window) throws IOException
    {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 1143,610, Color.rgb(44, 62, 80));

        window.setResizable(false);
        window.setScene(scene);
        window.show();
    }

}