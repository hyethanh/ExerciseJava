package OOPExercise1;

import java.util.Arrays;

public class Triangle {

    private double x1;
    private double y1;

    private double x2;
    private double y2;

    private double x3;
    private double y3;


    public Triangle() {

    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {

        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;

        this.x3 = x3;
        this.y3 = y3;

    }


    public static double getDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }

    public boolean isTriangle() {

        double a[] = new double[3];
        a[0] = getDistance(x1, y1, x2, y2);
        a[1] = getDistance(x1, y1, x3, y3);
        a[2] = getDistance(x2, y2, x3, y3);
        Arrays.sort(a);

        return ((a[0] + a[1] <= a[2])? false:true);
    }

    public String getType() {

        double a[] = new double[3];

        a[0] = getDistance(x1, y1, x2, y2);
        a[1] = getDistance(x2, y2, x3, y3);
        a[2] = getDistance(x1, y1, x3, y3);

        Arrays.sort(a);


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

    public double getPerimeter() {

        double a[] = new double[3];

        a[0] = getDistance(x1, y1, x2, y2);
        a[1] = getDistance(x2, y2, x3, y3);
        a[2] = getDistance(x1, y1, x3, y3);

        return (double) Math.round((a[0] + a[1] + a[2]) * 100) / 100;
    }

    public double getArea() {

        double a[] = new double[3];

        a[0] = getDistance(x1, y1, x2, y2);
        a[1] = getDistance(x2, y2, x3, y3);
        a[2] = getDistance(x1, y1, x3, y3);

        double p1 = getPerimeter() / 2;

        return Math.sqrt(p1 * (p1 - a[0]) * (p1 - a[1]) * (p1 - a[2]));

    }

}
