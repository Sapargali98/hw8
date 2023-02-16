public class Triangle {
    double a;
    double b;
    double c;
    double p=(a+b+c)/2;
public Triangle(double a,double b,double c) {
    this.a=a;
    this.b=b;
    this.c=c;
}
public double getP() {
    return (a+b+c);
}
public double getS() {
    return (Math.sqrt((p)*(p-a)*(p-b)*(p-c)));
}
}
