//QUESTION 3
package JavaCybertekEU.assignment_EU2.assignment14_krm;

public class DataBase {

    private String data;
    private int yint;

    public void insertData (String data, int yint) {
        setData(data);
        setYint (yint);
    }


    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getYint() {
        return yint;
    }
    public void setYint(int yint) {
        this.yint = yint;
    }

}
