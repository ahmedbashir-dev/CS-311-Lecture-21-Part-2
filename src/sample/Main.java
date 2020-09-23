package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private VBox root;
    private TabPane tabPane;
    private Tab tab1, tab2, tab3;
    private Button btn1, btn2, btn3;
    @Override
    public void start(Stage primaryStage) throws Exception{
        btn1 = new Button("Button of Tab 1");
        btn2 = new Button("Button of tab 2");
        btn3 = new Button("Button of tab 3");
        tabPane = new TabPane();
        tab1 = new Tab("Cars",btn1);
        tab2 = new Tab("Tab 2", btn2);
        tab3 = new Tab("Tab 3", btn3);
        tabPane.getTabs().addAll(tab1,tab2,tab3);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        root = new VBox(tabPane);
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Tab Pane Example");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
