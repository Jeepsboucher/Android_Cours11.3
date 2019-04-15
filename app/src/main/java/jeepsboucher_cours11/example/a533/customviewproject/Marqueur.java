package jeepsboucher_cours11.example.a533.customviewproject;

import android.graphics.Bitmap;

public class Marqueur implements PlanViewDisplayable{
    private float positionX = 0;
    private float positionY = 0;
    private Bitmap marqueur;

    public Marqueur(Bitmap marqueur, float positionX, float positionY) {
        this.marqueur = marqueur;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public float getPositionX() {
        return positionX - 60;
    }

    @Override
    public float getPositionY() {
        return positionY- 120;
    }

    @Override
    public float getWidth() {
        return marqueur.getWidth();
    }

    @Override
    public float getHeight() {
        return marqueur.getHeight();
    }

    @Override
    public Bitmap getBitmap() {
        return marqueur;
    }
}
