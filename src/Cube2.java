public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube(1);
        this.color = "black";
    }

    public Cube2(int side) {
        this.basicCube = new Cube(side);
        basicCube.setSide(side);
        this.color = "black";
    }

    public Cube2(int side, String color) {
        this.basicCube = new Cube(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side) {
        this.basicCube.setSide(side);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Cube2 other){
        if (this.getSide() == other.getSide()
                && this.getColor().equals(other.getColor())) {
            return true;
        }
        else return false;
    }

    public String toString(){
        return "Cube{side=" + this.getSide() + ", color=\"" + this.getColor() + "\"}";
    }

    public int calculateVolume() {
        return basicCube.calculateVolume();
    }

    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }

    // ADD AND MINUS METHODS FROM YOUR IMAGE

    public Cube2 add(Cube2 otherCube) {
        int a = this.getSide();
        int b = otherCube.getSide();
        int c = a * a + b * b;
        double cRoot = Math.sqrt(c);

        if (cRoot == (int) cRoot) {
            return new Cube2((int) cRoot, this.getColor());
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Cube2 minus(Cube2 otherCube) {
        int e = this.getSide();
        int f = otherCube.getSide();
        if (e > f) {
            int g = e * e - f * f;
            double fRoot = Math.sqrt(g);
            if (fRoot == (int) fRoot) {
                return new Cube2((int) fRoot, this.getColor());
            } else
                throw new IllegalArgumentException();
        } else {
            int x = f * f - e * e;
            double xRoot = Math.sqrt(x);
            if (xRoot == (int) xRoot) {
                return new Cube2((int) xRoot, this.getColor());
            } else
                throw new IllegalArgumentException();
        }
    }
}
