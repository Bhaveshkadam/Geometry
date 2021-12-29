package com.geometry.graph;

class Point {
    private String label;
    private double x;
    private double y;

    Point(double x, double y, String label) {
        Point newPoint = new Point(x, y, label);
        System.out.printf("Successfully created %s\n", newPoint);
        //  TODO: Associate the point with a quadrant
    }

    Point(double x, double y) {
        //  TODO: Implement a logic to generate unique labels
        this(x, y, "Unnamed");
        //  TODO: Associate the point with a quadrant
    }

    public double distanceFrom(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distanceFrom() {
        return distanceFrom(0, 0);
    }

    public double distanceFrom(Point point) {
        return distanceFrom(point.x, point.y);
    }

    public String getLabel() {
        return label;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("%s(%.2f, %.2f)", label, x, y);
    }
}