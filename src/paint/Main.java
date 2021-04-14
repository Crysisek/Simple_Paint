package paint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    //metoda ustawiająca scene jako plik fxml
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("paint.fxml"))));
        primaryStage.setTitle("Paint App");
        primaryStage.show();
    }


    //uruchomienie programu
    public static void main(String[] args)
    {
        launch(args);
    }
}
