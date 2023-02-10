public class Main {
    public static void main(String[] args) {
        Student myAlice=new Student("Алиса","Смит","Коктем-2",24);
        Student myAzamat=new Student("Азамат","Ким","Сатпаева",12);
        Student myKristina=new Student("Кристина","Егорова","Конаева",56);
        System.out.println(myKristina);
        System.out.println(myAlice);
        System.out.println(myAzamat);
        Triangle myTriangle=new Triangle();
        System.out.println("P="+(myTriangle.a+myTriangle.b+myTriangle.c));
        System.out.println("S="+(Math.sqrt(myTriangle.p*(myTriangle.p-myTriangle.a)*(myTriangle.p-myTriangle.b)*(myTriangle.p-myTriangle.c))));
        Rectangle myRect1=new Rectangle();
        Rectangle myRect2=new Rectangle();
        System.out.println("S1="+myRect2.returnArea1());
        System.out.println("S2="+myRect1.returnArea());
        Average myAverage=new Average();
        System.out.println("Average="+ myAverage.getAverage());
        Movie myMovie=new Movie("Фокус","RatPac-Dune Entertainment","R");
        Movie myMovie1=new Movie("Главный герой","20th Century Studios");
    }
}