/* 1. Box class with parameterized constructor and volume method. */
class Box {
    double w, h, d;
    Box(double w, double h, double d) { this.w = w; this.h = h; this.d = d; }
    double getVolume() { return w * h * d; }
}
public class BoxVolume {
    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 30);
        System.out.println("Volume: " + myBox.getVolume());
    }
}