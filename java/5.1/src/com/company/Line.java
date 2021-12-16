package com.company;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin; // beginning point
    private Point end; // ending point

    // Constructors
    public Line(Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY); // construct the Points here
        end = new Point(endX, endY);
    }

    // Public methods
    public String toString() {
        "begin at " + begin + "end at" +end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() { return end;}

    public void setBegin(Point begin) { this.begin.setXY(10,10);}

    public void setEnd(Point end) { this.end.setXY(20,20);}

    public int getBeginX(Point bx) { this.begin.setX(bx.getX());}

    public int getBeginY() { ......}

    public int getEndX() { ......}

    public int getEndY() { ......}

    public void setBeginX(......) { ......}

    public void setBeginY(......) { ......}

    public void setBeginXY(......) { ......}

    public void setEndX(......) { ......}

    public void setEndY(......) { ......}

    public void setEndXY(......) { ......}

    public int getLength() { ......} // Length of the line

    // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    public double getGradient() { ......} // Gradient in radians
}