public class Exercise15 {
    public String Triangle(int a,int b, int c){
        String result="";
        double p;
        double s;
        double p1;
        if( a+b<=c || b+c<a || a+c<=b)
            return "Khong phai la ba canh cua tam giac";
        else{
            p = a+b+c;
            p1 = p/2;
            s= Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));

            if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a))
                result="La 3 canh cua tam giac vuong co chu vi "+p+", dien tich "+s;
            else if((a==b && a!=c && b!=c)||(b==a && b!=c && a!=c)||(c==a && c!=b && a!=b))
                result="La 3 canh tam giac can co chu vi "+p+", dien tich "+s;
            else if(a==b && a==c && b==c)
                result="La 3 canh tam giac deu co chu vi "+p+", dien tich "+s;
            else if(a!=b && a!=c && b!=c)
                result="La 3 canh tam giac thuong co chu vi "+p+", dien tich "+s;
        }
        return result;
    }
}
