package day33_classObject_contructors;

public class Cartest2 {
    public static void main(String[] args) {
Car1 carx = new Car1();

carx.setColor("red");
carx.setEngine(1.6);


//carx.color = "red";
//carx.model = "doblo";
//carx.engine = 1.6;
//carx.doors = 4;

System.out.println("color of car = " + carx.getColor());
//System.out.println("model of car = " + carx.model);
System.out.println("engine of car = " + carx.getEngine());
//System.out.println("doors of car = " + carx.doors);




    }
}
