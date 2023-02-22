package com.csc205.project2;

public class Pyramid extends Shape {

    private double length;
    private double width;
    private double height;

    public Pyramid() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    public Pyramid(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return length * width + length * (Math.sqrt(Math.pow((width/2),2) + Math.pow(height, 2))) + width * Math.sqrt(Math.pow((length/2), 2) + Math.pow(height, 2));
    }

    public double volume() {
        return (length * width * height)/3;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramid{");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}