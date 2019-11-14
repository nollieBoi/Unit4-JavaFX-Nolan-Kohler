import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NamePrinter extends Application {

    private TextField name;
    private TextField age;
    private TextField hobby;
    private TextField favColor;
    private TextField print;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Font font = new Font(18);
        Label nameLabel = new Label("Name:");
        nameLabel.setFont(font);
        GridPane.setHalignment(nameLabel, HPos.RIGHT);

        Label ageLabel = new Label("Age:");
        ageLabel.setFont(font);
        GridPane.setHalignment(ageLabel, HPos.RIGHT);


        Label hobbyLabel = new Label("Hobby:");
        hobbyLabel.setFont(font);
        GridPane.setHalignment(hobbyLabel, HPos.RIGHT);


        Label favColorLabel = new Label("Favorite color:");
        favColorLabel.setFont(font);
        GridPane.setHalignment(favColorLabel, HPos.RIGHT);

        name = new TextField();
        name.setFont(font);
        name.setPrefWidth(70);
        name.setAlignment(Pos.CENTER);
        name.setOnAction(this::processReturn);

    }

    public void processReturn(ActionEvent event){

    }
}
