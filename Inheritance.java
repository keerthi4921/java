class Auto
{
    void auto()
    {
        System.out.println("Uber");

    }
}
class Bike extends Auto
{
    void bike()
    {
       System.out.println("Pulsar"); 
    }
}
class Car extends Bike
{
    Car(){
        System.out.println("BMW");
    }
    Car(int n){
        for(int i=1;i<n;i++){
            System.out.println("ROLLS ROYCE");
        }
    }
    Car (String car){
        System.out.println(car);
    }
    Car(String car,int n){
        for(int i=1;i<n;i++){
            System.out.println(car);
        }
    }
}
public class Inheritance extends Car{
    public static void main(String[] args) {
        Inheritance I=new Inheritance();
          Car i=new Car(6);
          Car c=new Car("Benz");
          Car d=new Car("Thar",8);
        for(int j=1;j<=5;j++){
        I.bike();
    }
}
}