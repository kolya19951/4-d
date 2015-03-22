package com;

/**
 * Created by Коля on 19.03.2015.
 */
public class Tesseract {
    Top top[] = new Top[16];
    public Vector_4d position;
    private Vector_4d direction;
    public Edge edges = new Edge("Tesseract");
    Tesseract(){
        for(int i = 0; i < 16; i++)
            top[i] = new Top();
        for(int i = 0; i < 16; i++){
            top[i].position.t = (i & 1)*2-1;
            top[i].position.z = ((i & 2)/2)*2-1;
            top[i].position.y = ((i & 4)/4)*2-1;
            top[i].position.x = ((i & 8)/8)*2-1;
        }

        this.position = new Vector_4d(0, 0, 0, 0);
        this.direction = new Vector_4d(0.0, 0.6, 0.8, 0.0);
        for(int i = 0; i < 16; i++){
            top[i].position4d = top[i].position.sum(this.position);
        }
    }

    void rotate(float f) {
        for (int i = 0; i < 16; i++) {
            this.top[i].position4d.rotateXY(f);
        }
    }
}
