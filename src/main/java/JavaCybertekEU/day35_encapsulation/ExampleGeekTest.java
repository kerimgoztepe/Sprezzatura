package JavaCybertekEU.day35_encapsulation;

public class ExampleGeekTest {


        public static void main (String[] args)  {
            ExampleFromGeeksforGeeks obj = new ExampleFromGeeksforGeeks();
            ExampleFromGeeksforGeeks obj1 = new ExampleFromGeeksforGeeks();

            // setting values of the variables
            obj.setName("Harsh");
            obj.setAge(19);
            obj.setRoll(51);

            obj1.setName("kerim"); obj1.setAge(44); obj1.setRoll(22);

            // Displaying values of the variables
            System.out.println("Geek's name: " + obj.getName());
            System.out.println("Geek's age: " + obj.getAge());
            System.out.println("Geek's roll: " + obj.getRoll());

            System.out.println(obj1.getName()+ "--> age = "+obj1.getAge()+"-->Roll ="+obj1.getRoll());

            // Direct access of geekRoll is not possible
            // due to encapsulation
            // System.out.println("Geek's roll: " + obj.geekName);
        }
    }


