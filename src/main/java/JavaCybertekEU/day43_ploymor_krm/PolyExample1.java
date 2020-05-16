package day43_ploymor_krm;


    class Kebaplik {
        public void animalSoundd() {
            System.out.println("The animal makes a sound, suru saglam ses yapar");
        }
    }

    class Keci extends Kebaplik {
        public void animalSoundd() {
            System.out.println("The Keci says: beee beeeee"); //keci sutunu pek severim
        }
    }

    class Davar extends Kebaplik {
        public void animalSoundd() {
            System.out.println("The Davar says: meee beee eee");
        }
    }
    class Kuzu extends Kebaplik {
        public void animalSoundd() {
        System.out.println("The Kuzu says: meeeeeeee");  // kuzu cevirme kraldir
    }
}

    class MyMainClass {
        public static void main(String[] args) {
            Kebaplik myAnimal = new Kebaplik();  // Create a Kebap object
            Kebaplik myKeci = new Keci();  // Create a Keci object
            Kebaplik myDavar = new Davar();  // Create a Davar object
            Kebaplik myKuzu = new Kuzu(); //kuzu kuzu obje

            myAnimal.animalSoundd();
            myKeci.animalSoundd();
            myDavar.animalSoundd();         //sis kebap olsada yesek
            myKuzu.animalSoundd();
        }
    }

