package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


import java.util.ArrayList;

public class Controller extends Pane{
        ArrayList<Brick> bricks = new ArrayList<Brick>();
       Pane pane = new Pane();

    public void level1(){
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 15; j++){
                bricks.add(new Brick(100+j*52,100+i*27));
            }
        }
    }
    Ball ball = new Ball();
    Racket racket = new Racket();

    public Controller(){
        Ball ball = new Ball();
        Racket racket = new Racket();

    }

    public void run(){
        ball.moveBall();
        racketMove();

    }

    public void racketMove(){
        pane.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.RIGHT) {
                racket.setRight();
            }
            else if(e.getCode() == KeyCode.LEFT){
                racket.setLeft();
            }
        });
    }

}
