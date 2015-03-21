package com;

import java.awt.*;
import java.applet.Applet;

/**
 * Created by Коля on 19.03.2015.
 */
public class Demention4 extends Applet {
    private static final long serialVersionUID = 4902057285471885308L;

    private int a = 0;

    public void paint(Graphics g) {
        setSize(new Dimension(700, 600));
        Color oldColor = g.getColor();
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, getSize().width - 1, getSize().height - 1);
         Color red = new Color(255, 0, 0);
        Color cyan = new Color(0, 255, 255);

        Exposition e = new Exposition();
        e.Calculate3dProjection();
        int tmp[][] = new int[32][2];
        int tmp2[][] = new int[32][2];

        for (int i = 0; i < 32; i++) {
            tmp[i][0] = e.t1.edges.lines[i][0];
            tmp[i][1] = e.t1.edges.lines[i][1];
        }
        for (int i = 0; i < 32; i++) {
            tmp2[i][0] = e.t2.edges.lines[i][0];
            tmp2[i][1] = e.t2.edges.lines[i][1];
        }
        int m = 1100;
        int my = 800;
        for (int i = 0; i < 32; i++){
            g.setColor(cyan);
            g.drawLine((int) (e.t1.top[tmp[i][0]].position2d.x * m) + 250, (int) (e.t1.top[tmp[i][0]].position2d.y * m) - my, (int) (e.t1.top[tmp[i][1]].position2d.x * m) + 250, (int) (e.t1.top[tmp[i][1]].position2d.y * m) -my);
            g.setColor(red);
            g.drawLine((int) (e.t2.top[tmp2[i][0]].position2d.x * m)  + 250, (int) (e.t2.top[tmp2[i][0]].position2d.y * m)  - my,(int) (e.t2.top[tmp2[i][1]].position2d.x * m)  + 250,(int) (e.t2.top[tmp2[i][1]].position2d.y * m) - my);

        }


    }
}
