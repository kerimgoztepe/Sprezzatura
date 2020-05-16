package day48_collection_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOFM_krm {
    public static void main(String[] args) {
        List<Map<String,String>> employess = new ArrayList<>();

        Map<String,String> emp1Data = new HashMap<>();
        emp1Data.put("Emp1D", "123");
        emp1Data.put("Empname", "john");
        emp1Data.put("jobtitle", "SDET");
        emp1Data.put("salary", "5400");

        Map<String,String> emp2Data = new HashMap<>();
        emp2Data.put("Emp1D", "343");
        emp2Data.put("Empname", "Mark");
        emp2Data.put("jobtitle", "Programmer");
        emp2Data.put("salary", "3400");

        employess.add(emp1Data);
        employess.add(emp2Data);

        System.out.println(employess.toString());
        System.out.println(employess.size());

        System.out.println(employess.get(0));
        System.out.println(employess.get(1).get("EmpName"));

        //print each employee title by using for each loop

        System.out.println("++++title++++");
        int totalSalary = 0;
        for(Map<String,String> emp : employess) {
            System.out.println(emp.get("jobtitle"));
        }

        System.out.println("Total Salary = "+ totalSalary);





    }

}
