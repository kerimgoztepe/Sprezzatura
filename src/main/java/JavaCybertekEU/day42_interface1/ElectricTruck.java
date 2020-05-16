package day42_interface1;


    public abstract class ElectricTruck extends ElectricCar {

        public ElectricTruck(String model, double price, String color) {
            super(model, price, color);

        }

        public abstract void load (String item);

    }


