package com.poc.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane gridPane = new GridPane();
        primaryStage.setTitle("Hello World");
        HBox hBox = new HBox();
        hBox.setSpacing(2);

        Button b1 = new Button("Ok");
        Button b2 = new Button("Cancel");
        hBox.getChildren().addAll(b1,b2);

        TextField username = new TextField();
        username.setPromptText("username");
        TextField email = new TextField();
        email.setPromptText("email");

        VBox vBox = new VBox();
        vBox.setSpacing(3);

        vBox.getChildren().addAll(username,email);
        GridPane.setConstraints(vBox,1,3);

        ComboBox<String> combo = new ComboBox<String>();
        combo.getItems().addAll("low","medium","high");
        combo.setPromptText("Priority");
        //combo.setPrefSize(30,30);
        BorderPane borderPane = new BorderPane();
        HBox hboxborder = new HBox();
        hboxborder.getChildren().addAll(combo);
        hboxborder.setSpacing(3);
        borderPane.setBottom(hboxborder);

        CheckBox checkBox = new CheckBox("Opt");
        borderPane.setRight(checkBox);
        borderPane.setVisible(true);
        Spinner<Integer> spinner = new Spinner<Integer>(0,100,0);

        TableView table = new TableView();
        table.setMinHeight(100);
        table.setMinWidth(100);

        TableColumn  column = new TableColumn("Name");
        TableColumn  column1 = new TableColumn("Email");
        TableColumn  column2 = new TableColumn("Address");
        table.getColumns().addAll(column,column1,column2);

        GridPane.setConstraints(table,1,6);


        borderPane.setTop(spinner);
        GridPane.setConstraints(borderPane,1,4);
        gridPane.getChildren().addAll(hBox,vBox,borderPane,table);
        GridPane.setConstraints(hBox,1,2);
        primaryStage.setScene(new Scene(gridPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
