package io.johnvincent.clicker;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class Utils {
	
    public static void sleep(int p) {
        try {
            System.out.println("Move mouse to click location...");
            System.out.println("Sleeping...");
            Thread.sleep(p);
            System.out.println("Awake!");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static Coords getCurrentCoords() {
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b  = a.getLocation();
        return new Coords((int) b.getX(), (int) b.getY());
    }
}
