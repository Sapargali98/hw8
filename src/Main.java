public class Main {
    public static void main(String[] args) {
        Student myAlice=new Student("Алиса","Смит","Коктем-2",24);
        Student myAzamat=new Student("Азамат","Ким","Сатпаева",12);
        Student myKristina=new Student("Кристина","Егорова","Конаева",56);
        System.out.println(myKristina);
        System.out.println(myAlice);
        System.out.println(myAzamat);
        Triangle myTriangle=new Triangle(3,5,4);
        System.out.println("P="+myTriangle.getP());
        System.out.println("S="+myTriangle.getS());
        Rectangle myRect1=new Rectangle(5,9);
        System.out.println("S1="+myRect1.returnArea());
        Rectangle myRect2=new Rectangle(10,14);
        System.out.println("S1="+myRect2.returnArea());
        Average myAverage=new Average();
        System.out.println("Average="+ myAverage.getAverage());
        Movie myMovie=new Movie("Фокус","RatPac-Dune Entertainment","R");
        Movie myMovie1=new Movie("Главный герой","20th Century Studios");
        System.out.println(myMovie1);
        System.out.println(myMovie);
    }
}