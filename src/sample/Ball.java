package sample;

/**
 * Created by magnusfinvik on 19.03.2015.
 */
import javafx.animation.AnimationTimer;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Ball extends Pane {
    private double radius = 10;
    private double x = 300;
    private double y = 300;
    private double ballDirectionX = 1;
    private double ballDirectionY = -1;
    Circle circle = new Circle(x, y, radius, Color.RED);
    private AnimationTimer timer;

    public Ball(){
        getChildren().add(circle);
    }

    public void moveBall() {
        if (x == radius){
            setBallDirectionX(1);
        }
        if(x == 800 - radius){
            setBallDirectionX(-1);
        }
        if(y == 0){
            setBallDirectionY(1);
        }
        x += ballDirectionX;
        y += ballDirectionY;
        circle.setCenterX(x);
        circle.setCenterY(y);

    }

    public void setBallDirectionX(double ballDirectionX) {
        this.ballDirectionX = ballDirectionX;
    }

    public void setBallDirectionY(double ballDirectionY) {
        this.ballDirectionY = ballDirectionY;
    }
}
