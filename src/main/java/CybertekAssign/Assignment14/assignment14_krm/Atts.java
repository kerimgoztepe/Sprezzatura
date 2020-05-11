package assignment_EU2.assignment14_krm;

public class Atts {

        public String name;
        public String color;
        public int amount;

        @Override
        public String toString() {
            return "name=" + name + ", color=" + color + ", amount=" + amount;
        }

    }

    class Test {
        public static void main(String[] args) {
            Atts a = new Atts();
            a.name = "table1";
            a.color = "brown";
            a.amount = 1;

            Atts b = new Atts();
            b.name = "table2";
            b.color = "green";
            b.amount= 2;

            System.out.println(a.toString());
            System.out.println(b.toString());


        }
    }

