package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //okno
        Group root = new Group();
        Scene scene = new Scene(root ,720, 406);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("vičer");

        //blur efekt
        GaussianBlur blur1 = new GaussianBlur();
        int glowsize = 10;

        //symbol 1
        Polyline sym1 = new Polyline(130,191, 143,174, 103,174, 143,223, 103,223, 112,210);
        sym1.setFill(Color.TRANSPARENT);
        sym1.setStroke(Color.rgb(135, 68, 171));
        sym1.setStrokeWidth(glowsize);
        sym1.setEffect(blur1);

        Polyline sym1_glow = new Polyline(130,191, 143,174, 103,174, 143,223, 103,223, 112,209);
        sym1_glow.setFill(Color.TRANSPARENT);
        sym1_glow.setStroke(Color.WHITE);
        sym1_glow.setStrokeWidth(3);

        //symbol 2
        Polyline sym2 = new Polyline(245,190, 262,190, 270,174, 218,174, 244,223, 252,209);
        sym2.setFill(Color.TRANSPARENT);
        sym2.setStroke(Color.rgb(223, 226, 61));
        sym2.setStrokeWidth(glowsize);
        sym2.setEffect(blur1);

        Polyline sym2_glow = new Polyline(245,190, 262,190, 270,174, 218,174, 244,223, 252,209);
        sym2_glow.setFill(Color.TRANSPARENT);
        sym2_glow.setStroke(Color.WHITE);
        sym2_glow.setStrokeWidth(3);

        //symbol 3
        Polyline sym3 = new Polyline(366,174, 339,224, 391,224, 375,194);
        sym3.setFill(Color.TRANSPARENT);
        sym3.setStroke(Color.rgb(223, 20, 39));
        sym3.setStrokeWidth(glowsize);
        sym3.setEffect(blur1);

        Polyline sym3_glow = new Polyline(366,174, 339,224, 391,224, 375,194);
        sym3_glow.setFill(Color.TRANSPARENT);
        sym3_glow.setStroke(Color.WHITE);
        sym3_glow.setStrokeWidth(3);

        //symbol 4
        Polyline sym4 = new Polyline(513,174, 459,174, 487,223, 505,191);
        sym4.setFill(Color.TRANSPARENT);
        sym4.setStroke(Color.rgb(0, 208, 0));
        sym4.setStrokeWidth(glowsize);
        sym4.setEffect(blur1);

        Polyline sym4_glow = new Polyline(513,174, 459,174, 487,223, 505,191);
        sym4_glow.setFill(Color.TRANSPARENT);
        sym4_glow.setStroke(Color.WHITE);
        sym4_glow.setStrokeWidth(3);

        //symbol 5
        Polyline sym5 = new Polyline(598,189, 608,174, 635,223, 580,224, 591,206, 607,206);;
        sym5.setFill(Color.TRANSPARENT);
        sym5.setStroke(Color.rgb(40, 255, 213));
        sym5.setStrokeWidth(glowsize);
        sym5.setEffect(blur1);

        Polyline sym5_glow = new Polyline(598,189, 608,174, 635,223, 580,224, 591,206, 607,206);
        sym5_glow.setFill(Color.TRANSPARENT);
        sym5_glow.setStroke(Color.WHITE);
        sym5_glow.setStrokeWidth(3);

        root.getChildren().addAll(sym1, sym1_glow, sym2, sym2_glow, sym3, sym3_glow, sym4, sym4_glow, sym5, sym5_glow);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
