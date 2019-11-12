import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Counter extends Application {

    private int count;
    private Text countText;

    public static void main(String[] args) { launch(args); }


    @Override
    public void start(Stage stage) {
        count = 50;
        countText = new Text("Count: 50");
        countText.getText();

        Button pushU = new Button("Count +1");
        pushU.setOnAction(this::UpButtonPress);

        Button pushD = new Button("Count -1");
        pushD.setOnAction(this::DownButtonPress);

        FlowPane paneU = new FlowPane(pushU, pushD, countText);
        paneU.setAlignment(Pos.CENTER);
        paneU.setHgap(20);
        paneU.setStyle("-fx-background-color: grey");

        Scene scene = new Scene(paneU, 300, 200);

        stage.setTitle("Counter");
        stage.setScene(scene);
        stage.show();

    }
    private void UpButtonPress(ActionEvent event){
        count++;
        countText.setText("Count: " + count);
    }
    private void DownButtonPress(ActionEvent event){
        count--;
        countText.setText("Count: " + count);
    }
}
