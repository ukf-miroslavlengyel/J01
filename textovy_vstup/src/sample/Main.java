package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root ,640, 480);
        primaryStage.setTitle("Text na farbu");
        scene.setFill(Color.rgb(128,168,20));

        TextField vstup = new TextField();
        vstup.setTranslateX(20);
        vstup.setTranslateY(20);

        Button ok = new Button("OK");
        ok.setTranslateX(180);
        ok.setTranslateY(20);

        Text napis = new Text(20, 240, "Napíš niečo hore a stlač OK");
        napis.setFont(new Font(20));

        Text napis2 = new Text(20, 260, "rgb(128,168,20)");
        Text napis3 = new Text(20, 275, "#80A814");

        root.getChildren().addAll(vstup,ok,napis,napis2,napis3);
        primaryStage.setScene(scene);
        primaryStage.show();

        ok.setOnAction(click -> {
            napis.setText(vstup.getText());
            int[] farba = new int[3];

            String text = vstup.getText();

            for(int i = 0; i<text.length(); i++) {
                switch (text.charAt(i)) {
                    //samohlasky
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y': farba[0]+=16;break;

                    //spoluhlasky
                    case 'd':
                    case 't':
                    case 'n':
                    case 'l':
                    case 'g':
                    case 'k':
                    case 'h':
                    case 'c':
                    case 'j':
                    case 'b':
                    case 'm':
                    case 'p':
                    case 'r':
                    case 's':
                    case 'v':
                    case 'z':
                    case 'f': farba[1]+=24;break;
                }
            }

            farba[2] = (text.length()%25)*10;

            for(int i = 0; i<2; i++)
            {
                if(farba[i]>255)farba[i]=255;
            }

            if(farba[0]<150 && farba[1]<150 && farba[2]<150)
            {
                napis.setFill(Color.WHITE);
                napis2.setFill(Color.WHITE);
                napis3.setFill(Color.WHITE);
            }
            else
            {
                napis.setFill(Color.BLACK);
                napis2.setFill(Color.BLACK);
                napis3.setFill(Color.BLACK);
            }

            scene.setFill(Color.rgb(farba[0], farba[1], farba[2]));
            napis2.setText("rgb("+farba[0]+","+farba[1]+","+farba[2]+")");
            napis3.setText(String.format("#%02X%02X%02X", farba[0], farba[1], farba[2]));
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
