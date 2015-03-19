package sample;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 * Created by magnusfinvik on 19.03.2015.
 */
public class Racket extends Pane{
    private int posX;
    private int posY;
    private int dx;

    public Racket(){
        Rectangle rec = new Rectangle(posX, posY, 30, 10);
        rec.setArcHeight(5);
        rec.setArcWidth(5);
        getChildren().add(rec);
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY(){
        return this.posY;
    }

    public void move(){
        posX += dx;

    }
    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }
    public void setLeft(){
        this.dx = -2;
    }
    public void setRight(){
        this.dx = +2;
    }

}
