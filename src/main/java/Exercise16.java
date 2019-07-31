public class Exercise16 {

    public double edgeTriangle(int x1, int y1, int x2, int y2) {

        double z;
        z = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

        return z;
    }

    public String Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        String result = "";
        double p;
        double s;
        double p1;

        double a = edgeTriangle(x1, y1, x2, y2);
        double b = edgeTriangle(x1, y1, x3, y3);
        double c = edgeTriangle(x2, y2, x3, y3);

        double a1 = Math.sqrt(a);
        double b1 = Math.sqrt(b);
        double c1 = Math.sqrt(c);

        if (a1 + b1 <= c1 || b1 + c1 <= a1 || a1 + c1 <= b1) {

            return "Khong phai la ba canh cua tam giac";
        } else {

            p = a1 + b1 + c1;
            p1 = p / 2;
            s = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));

            p = (double) Math.round(p * 100) / 100;
            s = (double) Math.round(s * 100) / 100;

            if ((a + b == c) || (a + c == b) || (b + c == a)) {

                result = "La 3 canh cua tam giac vuong co chu vi " + p + ", dien tich " + s;

            } else {

                if (a1 == b1 || b1 == c1 || a1 == c1) {

                    result = "La 3 canh tam giac can co chu vi " + p + ", dien tich " + s;

                } else {

                    result = "La 3 canh tam giac thuong co chu vi " + p + ", dien tich " + s;

                }
            }
        }

        return result;
    }
}