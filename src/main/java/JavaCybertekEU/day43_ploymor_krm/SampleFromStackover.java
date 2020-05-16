package day43_ploymor_krm;

public class SampleFromStackover {

            public String getType () {
            System.out.println("NormalDog");
            return "NormalDog";
        }
    }

    /**
     * Pet Dog has an extra method dogName()
     */
    class PetDog extends SampleFromStackover{
        public String getType () {
            System.out.println("PetDog");
            return "PetDog";
        }
        public String dogName () {
            System.out.println("I don't have Name !!");
            return "NO Name";
        }
    }

    /**
     * Police Dog has an extra method secretId()
     */
    class PoliceDog extends PetDog{

        public String secretId() {
            System.out.println("ID");
            return "ID";
        }

        public String getType () {
            System.out.println("I am a Police Dog");
            return "Police Dog";
        }


        public static void main (String[] args) {
            /**
             * Creating the different objects with super class Reference
             */
            SampleFromStackover obj1 = new SampleFromStackover();
            obj1.getType();
       /*
             *  Object of Pet Dog is created with Dog Reference since
             *  Upcasting is done automatically for us we don't have to worry about it
             *
             */
            SampleFromStackover obj2 = new PetDog();
            obj2.getType();
      /**
             *  Object of Police Dog is created with Dog Reference since
             *  Upcasting is done automatically for us we don't have to worry
             *  about it here even though we are extending PoliceDog with PetDog
             *  since PetDog is extending Dog Java automatically upcast for us
             */
            SampleFromStackover obj3 = new PoliceDog();
            obj3.getType();
        }

    }




