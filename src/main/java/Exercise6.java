public class Exercise6 {
    public void equation_2nd(int a,int b, int c){
        float x1,x2;
        if(a==0)
        {
            if(b==0) System.out.println("Phuong trinh vo nghiem");
            else {
                x1 = -c/b;
                System.out.println("Nghiem phuong trinh x = " +x1);
            }
        }
        float delta = b*b -4*a*c;
        if (delta > 0)
        {
            x1 = (float)((-b + Math.sqrt(delta) / (2*a)));
            x2 = (float)((-b - Math.sqrt(delta) / (2*a)));
            System.out.println("Phuong trinh co 2 nghiem phan biet");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
        else if(delta == 0 )
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 =  "+(-b/(2*a)));
        else
            System.out.println("Phuong trinh vo nghiem");
    }
}
