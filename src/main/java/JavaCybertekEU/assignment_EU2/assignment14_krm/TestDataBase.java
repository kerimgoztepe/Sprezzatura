//QUESTION 3 TEST
package assignment_EU2.assignment14_krm;

import javax.xml.crypto.Data;

public class TestDataBase {

    public static void main(String[] args) {

        DataBase db1 = new DataBase();
        DataBase db2 = new DataBase();
        DataBase db3 = new DataBase();

        db1.insertData("This is first data", -32100);
        db2.insertData("This is second data", 12345);
        db3.insertData("This is third data", 6789);

        System.out.println(db1.getData());
        System.out.println(db1.getYint());

        System.out.println(db2.getData());
        System.out.println(db2.getYint());

        System.out.println(db3.getData());
        System.out.println(db3.getYint());

        System.out.println("++++++++++++++++++++++");

        db1.setData("Now I change FIRST data TO 77777");
        db1.setYint(77777);

        System.out.println(db1.getData());
        System.out.println(db1.getYint());

    }
}