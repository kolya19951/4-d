package com;

import com.Tesseract;

/**
 * Created by Коля on 19.03.2015.
 */
public class Exposition {
    public Tesseract t1;
    public Tesseract t2;
    public Observer o1;
    Exposition(){
        this.t1 = new Tesseract();
        this.t2 = new Tesseract();
        t1.rotate(50);
        t2.rotate(87);
        this.o1 = new Observer();
    }

    void Calculate3dProjection() {
        for (int i = 0; i < 16; i++) {
            Vector_4d a = t1.top[i].position4d.minus(o1.position);
            double s = a.scalarProduct(o1.direction);
            s = s/(o1.direction.vLength());
            Vector_4d v = o1.direction.ConstProduct(s/o1.direction.vLength());
            Vector_4d v1 = a.minus(v);
            double l = o1.direction.vLength() / (v.vLength());
            t1.top[i].position3d = v1.ConstProduct(l);
        }
        for (int i = 0; i < 16; i++) {
            Vector_4d a = t1.top[i].position3d.minus(o1.position3d);
            double s = a.scalarProduct(o1.direction3d);
            double xx= o1.direction3d.vLength();
            s = s/(o1.direction3d.vLength());
            Vector_4d v = o1.direction3d.ConstProduct(s/o1.direction3d.vLength());
            Vector_4d v1 = a.minus(v);
            double l = o1.direction3d.vLength() / (v.vLength());
            t1.top[i].position2d = v1.ConstProduct(l);
        }
        for (int i = 0; i < 16; i++) {
            Vector_4d a = t2.top[i].position4d.minus(o1.position);
            double s = a.scalarProduct(o1.direction);
            s = s/(o1.direction.vLength());
            Vector_4d v = o1.direction.ConstProduct(s/o1.direction.vLength());
            Vector_4d v1 = a.minus(v);
            double l = o1.direction.vLength() / (v.vLength());
            t2.top[i].position3d = v1.ConstProduct(l);
        }
        for (int i = 0; i < 16; i++) {
            Vector_4d a = t2.top[i].position3d.minus(o1.position3d);
            double s = a.scalarProduct(o1.direction3d);
            double xx= o1.direction3d.vLength();
            s = s/(o1.direction3d.vLength());
            Vector_4d v = o1.direction3d.ConstProduct(s/o1.direction3d.vLength());
            Vector_4d v1 = a.minus(v);
            double l = o1.direction3d.vLength() / (v.vLength());
            t2.top[i].position2d = v1.ConstProduct(l);
        }
    }
}
