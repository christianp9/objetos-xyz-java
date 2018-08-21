package javaapplication15;

public class punto {
    private int x, y, z;
    String dimension;
    public punto(int coorx, int coory){
    
        this.x=coorx;
        this.y=coory;
    
    }
    public punto(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public punto(){
    
        this.x=0;
        this.y=0;
    
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
    
}
