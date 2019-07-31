import java.util.Arrays;

public class Exercise16 {

    public double edgeTriangle(double x1, double y1, double x2, double y2) {

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public String Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {

        String result = "";
        double p;
        double s;
        double p1;
        
        double a[] = new double[3];
        a[0] = edgeTriangle(x1, y1, x2, y2);
        a[1] = edgeTriangle(x1, y1, x3, y3);
        a[2] = edgeTriangle(x2, y2, x3, y3);
        Arrays.sort(a);


        if (a[0]+a[1]<=a[2] ) {

            return "Khong phai la ba canh cua tam giac";

        } else {

            p = a[0] + a[1] + a[2];
            p1 = p / 2;
            s = Math.sqrt(p1 * (p1 - a[0]) * (p1 - a[1]) * (p1 - a[2]));

            p = (double) Math.round(p * 100) / 100;
            s = (double) Math.round(s * 100) / 100;

            if ((a[0]*a[0])+(a[1]*a[1])==a[2]*a[2]) {

                result = "La 3 canh cua tam giac vuong co chu vi " + p + ", dien tich " + s;

            } else {

                if (a[0] == a[1] || a[1] == a[2] ) {

                    result = "La 3 canh tam giac can co chu vi " + p + ", dien tich " + s;

                } else {

                    result = "La 3 canh tam giac thuong co chu vi " + p + ", dien tich " + s;

                }
            }
        }

        return result;
    }
}