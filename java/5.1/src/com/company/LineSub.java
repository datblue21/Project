package com.company;

public class LineSub extends Point {
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end; // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }
    public LineSub (Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    public String toString() { ... }

    public Point getBegin() { ... }
    public Point getEnd() { ... }
    public void setBegin(...) { ... }
    public void setEnd(...) { ... }

    public int getBeginX() { ... }
    public int getBeginY() { ... }
    public int getEndX() { ... }
    public int getEndY() { ... }

    public void setBeginX(...) { ... }
    public void setBeginY(...) { ... }
    public void setBeginXY(...) { ... }
    public void setEndX(...) { ... }
    public void setEndY(...) { ... }
    public void setEndXY(...) { ... }

    public int getLength() { ... } // Length of the line
    public double getGradient() { ... } // Gradient in radians
}
