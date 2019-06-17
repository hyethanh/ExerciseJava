public class Exercise6 {
    public String equation2nd(int a,int b, int c) {

        float x1, x2;
        float delta = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                return "Phuong trinh vo nghiem";
            }
            else {
                x1 = -c / b;
                return "Nghiem phuong trinh x = " + x1;
            }
        }

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta) / (2 * a)));
            x2 = (float) ((-b - Math.sqrt(delta) / (2 * a)));
            return "Phuong trinh co 2 nghiem phan biet x1 = " + x1+" x2 = " + x2;

        }

        else if (delta == 0) {

            return "Phuong trinh co nghiem kep: x1 = x2 = " + (-b / (2 * a));

        }

        else {
            return "Phuong trinh vo nghiem";
        }

    }
}
