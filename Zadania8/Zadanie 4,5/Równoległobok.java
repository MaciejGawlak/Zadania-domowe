 package zadanie8.pkg4;

public class Równoległobok extends FiguraPlaska {

    private double a;
    private double h;

    public Równoległobok(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0) {
            this.a = -a;
        } else {
            this.a = a;
        };
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h < 0) {
            this.h = -h;
        } else {
            this.h = h;
        };
    }

    @Override
    public double obliczPole() {
        return (a * h);
    }

    @Override
    public double obliczObwód() {
        return 0;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Równoległobok:\n" + "Pole: " + obliczPole();
    }
}
