package MySampleJavaCodes;
import java.util.*;

public class javaListSample {

        public static void main(String[] args)  {
            List<String> strList = new ArrayList<String>();           // Creating a list
            //add items to list
            strList.add("Java");
            strList.add("C++");
            //print the size of list
            System.out.println("Size of list:" + strList.size());
            //add more items to list
            strList.add("Ruby");
            strList.add("Python");
            strList.add("C#");
            //print the size of list again
            System.out.println("Size of list after adding more elements:" + strList.size());
            //clear method
            strList.clear();

            System.out.println("List after calling clear() method:" + strList);
        }
    }
