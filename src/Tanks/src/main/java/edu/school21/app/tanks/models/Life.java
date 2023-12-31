package edu.school21.app.tanks.models;

import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;

public class Life {
    private ImageView border;
    private ImageView life;
    private int LEVEL = 305;

    public void setLife(int levelLife) {
        this.levelLife = levelLife;
    }

    private int levelLife = 100;

    public Life(Group root, double positionX, double positionY, GraphicsContext gc) {
        this.border = new ImageView("border.png");
        this.life = new ImageView("life.png");
        border.setFitHeight(55);
        border.setFitWidth(330);
        life.setFitHeight(37);
        life.setFitWidth(LEVEL);
        life.setX(positionX);
        life.setY(positionY);
        border.setX(positionX - 13);
        border.setY(positionY - 13);
        root.getChildren().addAll(life, border);
    }

    public void takeDamage() {
        if (levelLife >= 0) {
            levelLife -= 5;
            LEVEL -= 15;
            life.setFitWidth(LEVEL);
        }

    }

    public int getLevelLife() {
        return levelLife;
    }
}
