package com;

public class Vector_4d {
    public double x, y, z, t;
    Vector_4d(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.t = 0;
    }

    /*Vector_4d(Vector_4d a){
        this.x = a.x;
        this.y = a.y;
        this.z = a.z;
        this.t = a.t;
    }*/

    Vector_4d(double x,double y,double z,double t){
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }
    Vector_4d(int x,int y,int z,int t){
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }
    public Vector_4d sum(Vector_4d b){
        Vector_4d c = new Vector_4d();
        c.x = this.x + b.x;
        c.y = this.y + b.y;
        c.z = this.z + b.z;
        c.t = this.t + b.t;
        return c;
    }
    public Vector_4d minus(Vector_4d b){
        Vector_4d c = new Vector_4d();
        c.x = this.x - b.x;
        c.y = this.y - b.y;
        c.z = this.z - b.z;
        c.t = this.t - b.t;
        return c;
    }
    public Vector_4d ConstProduct(double c){
        Vector_4d tmp = new Vector_4d();
        tmp.x = this.x*c;
        tmp.y = this.y*c;
        tmp.z = this.z*c;
        tmp.t = this.t*c;
        return tmp;
    }
    public double scalarProduct(Vector_4d b)
    {
        Vector_4d c = new Vector_4d();
        c.x = this.x*b.x;
        c.y = this.y*b.y;
        c.z = this.z*b.z;
        c.t = this.t*b.t;
        return c.x + c.y + c.z + c.t;
    }

    public double vLength(){
        return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z + this.t*this.t);
    }
    public void rotateXY (double f){
        double x1, y1;
        x1 = this.x * Math.cos(f) - this.y * Math.sin(f);
        y1 = this.x * Math.sin(f) + this.y * Math.cos(f);
        this.x = x1;
        this.y = y1;
    }
}

