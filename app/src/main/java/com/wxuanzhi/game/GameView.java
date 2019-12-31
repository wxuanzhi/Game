package com.wxuanzhi.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    private float posX,posY=400;
    Lion lion;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(lion == null){
            lion = new Lion(this);
        }
        Log.d("Game","onDraw:"+getWidth() + "," + getHeight());
        Paint paint = new Paint();
        Paint paint0 = new Paint();
        paint0.setColor(0);
        canvas.drawLine(400,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.lion);
        canvas.drawBitmap(bitmap,lion.getX(),lion.getY(),paint);
        //for(int i = 0; i<getHeight()-bitmap.getHeight();i+=50){
          //  canvas.drawBitmap(bitmap,400,300+i,paint);
        //}
    }
    public void moveDown(){
        if(lion.getY() < getHeight() - 150){
            lion.setDirection(Lion.DIRECTION_DOWN);
            invalidate();
        }
    }
    public void moveUp(){
        if(lion.getY() > 50){
            lion.setDirection(Lion.DIRECTION_UP);
            invalidate();
        }
    }
    public void moveRight(){
        if(lion.getX() < getWidth() - 150){
            lion.setDirection(Lion.DIRECTION_RIGHT);
            invalidate();
        }
    }
    public void moveLeft(){
        if(lion.getX() > 50){
            lion.setDirection(Lion.DIRECTION_LEFT);
            invalidate();
        }
    }
    /*public float getPosX() {

        return posX;
    }

    public void setPosX(float posX) {
        if(posX >= 0 && posX < getWidth()-100) {
            this.posX = posX;
        }
    }

    public float getPosY() {

        return posY;
    }

    public void setPosY(float posY) {

        this.posY = posY;
    }*/
}
