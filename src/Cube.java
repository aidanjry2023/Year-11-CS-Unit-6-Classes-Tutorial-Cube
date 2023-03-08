public class Cube {

    int side;
    int volume;
    int surfaceArea;

    public int getSurfaceArea() {
        surfaceArea = (side * side) * 6;

        return surfaceArea;
    }

    public int getVolume() {
        volume = (side * side * side);

        return volume;
    }

    public Cube() {
        side = 1;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else {
            this.side = side;
        }
    }

    public Cube(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else {
            this.side = side;
        }
    }
}