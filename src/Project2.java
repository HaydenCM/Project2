import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.File;

public class Project2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
stage.setTitle("Hi, it's Hayden");
        Label myLabel = new Label("hi it's hayden");
        HBox myHBox = new HBox();
        CheckBox checkBox = new CheckBox("SpiderDog");
        CheckBox checkBox = new CheckBox("Cheerio Toilet");
        CheckBox checkBox = new CheckBox("Dog Bird");
        File file = new File("dog.jpeg");
        Image image = new Image(file.toURI().toString());
        File file2 = new File("cursed cereal.jpeg");
        Image image2 = new Image(file2.toURI().toString());
        File file3 = new File("src/dogbird.jpeg");
        Image image3 = new Image(file3.toURI().toString());


        ImageView myImageView = new ImageView(image);
        Button myButton = new Button("a button");

        ComboBox comboBox = new ComboBox();
        comboBox.getItems().add("SpiderDog");
        comboBox.getItems().add("Cheerio Toilet");
        comboBox.getItems().add("Dog Bird");
        comboBox.setEditable(true);

        comboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String value = (String) comboBox.getValue();

                if (value.equalsIgnoreCase("Cheerio Toilet")) {
                    myImageView.setImage(image2);


                }
                if (value.equalsIgnoreCase("SpiderDog")) {
                    myImageView.setImage(image);


                }
                if (value.equalsIgnoreCase("Dog Bird")) {
                    myImageView.setImage(image3);


                }
            }
        });

        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                myLabel.setText("Bye");
                myImageView.setImage(image2);
                String value = (String) comboBox.getValue();

                //myImageView.setImage;


            }
        });

        checkBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String value = (String) checkBox.getValue();

                if (value.equalsIgnoreCase("Cheerio Toilet")) {
                    myImageView.setImage(image2);


                }
                if (value.equalsIgnoreCase("SpiderDog")) {
                    myImageView.setImage(image);


                }
                if (value.equalsIgnoreCase("Dog Bird")) {
                    myImageView.setImage(image3);


                }
            }
        });
        myHBox.getChildren().add(myButton);
        myHBox.getChildren().add(myLabel);
        myHBox.getChildren().add(myImageView);
        myHBox.getChildren().add(comboBox);
        myHBox.getChildren().add(checkBox);


        Scene myScene = new Scene(myHBox, 200, 800);
       // myButton.setOnAction();
        stage.setScene(myScene);
stage.show();
    }

    public static void main(String[] args){
Application.launch(args);
    }
}


