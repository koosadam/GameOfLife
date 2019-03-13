package gameoflife;

public class Cell {

    private int coordinateY;
    private int coordinateX;
    private boolean state;

    public Cell() {
    }

    public Cell(int coordinateY, int coordinateX, boolean state) {
        this.coordinateY = coordinateY;
        this.coordinateX = coordinateX;
        this.state = state;
    }

    public Cell(int coordinateY, int coordinateX) {
        this.coordinateY = coordinateY;
        this.coordinateX = coordinateX;       
    }

    public boolean hasState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

}
