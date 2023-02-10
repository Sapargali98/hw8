public class Student {
    String name;
    String surname;
    String address;
    double id;

    public Student(String name,String surname,String address,double id)
    {   this.name=name;
        this.surname=surname;
        this.address=address;
        this.id=id;}
@Override
public String toString() {
    return String.format ("name: %s,surname:  %s,address:  %s,id: %f",name,surname,address,id);
}}