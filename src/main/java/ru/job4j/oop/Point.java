package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;

    private int y;

    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

     public double distance(Point that) {
         return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
        }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(2, 0);
        Point c = new Point(2, 3, 3);
        Point d = new Point(2, 0, 2);
        double distance = a.distance(b);
        double distance3d = c.distance3d(d);
        System.out.println(distance);
        System.out.println(distance3d);
    }
}