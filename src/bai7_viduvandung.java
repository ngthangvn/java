public class bai7_viduvandung {
    public static void main(String[] args) {
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        float d1 = 2.0f;
        float d2 = 5.0f;
        float d3 = -0.5f;
        System.out.println("(a)i1+(i2*i3) = " +(i1+(i2*i3)));
        System.out.println("(b)i1*(i2+i3) = " +(i1*(i2+i3)));
        System.out.println("(c)i1/(i2+i3) = " +(i1/(i2+i3)));

        System.out.println("(d)i1/i2+i3 = " +(((double)i1/i2)+i3));
        System.out.println("(g) 3+4+5/3 = " +(3+4+(double)5/3));
        System.out.println("(i) (3+4+5)/3 = " +((3+4+5)/3));
        System.out.println("(k) d1+(d2*d3) = " +(d1+(d2*d3)));
        System.out.println("(l) d1+d2*d3 = " +(d1+d2*d3));
        System.out.println("(m) d1/d2-d3 = " +((double)d1/d2-d3));
        System.out.println("(m) d1/(d2-d3) = " +((double)d1/(d2-d3)));
        System.out.println("(o) d1+d2+d3/3 = " +(d1+d2+((double)d3)/3));
        System.out.println("(p) (d1+d2+d3)/3 = " +((double)(d1+d2+d3)/3));
        System.out.println("(q) (d1+d2+d3)/3 = " +(d1+d2+(double)(d3/3)));
        System.out.println("3*(d1+d2)*(d1-d3) = " +(3*(d1+d2)*(d1-d3)));
    }
}
