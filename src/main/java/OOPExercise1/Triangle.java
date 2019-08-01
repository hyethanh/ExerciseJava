package OOPExercise1;

import java.util.Arrays;

public class Triangle {

    private double x1;
    private double y1;

    private double x2;
    private double y2;

    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {

        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;

        this.x3 = x3;
        this.y3 = y3;

    }

    public double egdeTriangle(double x1, double y1, double x2, double y2) {

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }

    public String getType() {

        double a[] = new double[3];

        a[0] = egdeTriangle(x1, y1, x2, y2);
        a[1] = egdeTriangle(x2, y2, x3, y3);
        a[2] = egdeTriangle(x1, y1, x3, y3);

        Arrays.sort(a);

        if (a[0] == a[1] && a[1] == a[2]) {

            return "Tam giac deu";
        } else {

            if ((a[0] == a[1]) && ((a[0] * a[0]) + (a[1] * a[1]) == a[2] * a[2])) {

                return "Tam giac vuong can";

            } else {

                if (a[0] == a[1] || a[1] == a[2]) {

                    return "Tam giac can";

                } else {

                    if ((a[0] * a[0]) + (a[1] * a[1]) == a[2] * a[2]) {

                        return "Tam giac vuong";
                    } else {

                        return "Tam giac thuong";
                    }
                }
            }
        }

    }

    public double getPerimeter() {

        double a[] = new double[3];

        a[0] = egdeTriangle(x1, y1, x2, y2);
        a[1] = egdeTriangle(x2, y2, x3, y3);
        a[2] = egdeTriangle(x1, y1, x3, y3);

        double p = a[0] + a[1] + a[2];

        return (double) Math.round(p * 100) / 100;
    }

    public double getArea() {

        double a[] = new double[3];

        a[0] = egdeTriangle(x1, y1, x2, y2);
        a[1] = egdeTriangle(x2, y2, x3, y3);
        a[2] = egdeTriangle(x1, y1, x3, y3);

        double p1 = getPerimeter() / 2;
        double s = Math.sqrt(p1 * (p1 - a[0]) * (p1 - a[1]) * (p1 - a[2]));

        return (double) Math.round(s * 100) / 100;

    }

}
