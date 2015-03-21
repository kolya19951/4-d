package com;

/**
 * Created by Коля on 19.03.2015.
 */
class Observer {
    public Vector_4d position;
    public Vector_4d direction;
    public Vector_4d position3d;
    public Vector_4d direction3d;
    Observer(){
        this.direction = new Vector_4d(0, 0, 0, 5);
        this.position = new Vector_4d(0,0,0,-5);
        this.position3d = new Vector_4d(0,-30,0,0);
        this.direction3d = new Vector_4d(0, 1, 1, 0);
    }
}
