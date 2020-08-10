package HackerRankFiles.collectioNs;
import java.util.*;
import java.util.Collections;
public class ArrayList1 {

    //Why ArrayList is better than Array?
    //The limitation with array is that it has a fixed length
    // so if it is full you cannot add any more elements to it,
    // likewise if there are number of elements gets removed from it
    // the memory consumption would be the same as it doesn’t shrink.

        public static void main(String[] args){
            ArrayList<String> newlist=new ArrayList<String>();
            newlist.add("Ali");
            newlist.add("Veli");
            newlist.add("Marco");
            newlist.add("Stefano");
            newlist.add("Anna");
            newlist.add("Roberta");

            //displaying elements
            System.out.println(newlist);

            //Adding "Steve" at the fourth position
            newlist.add(3, "Stefano");

            //displaying elements
            System.out.println(newlist);

            //remove Ali from list
            newlist.remove(0);
            System.out.println(newlist);
            //size of array
            int sizE = newlist.size();
            System.out.println("Size is = "+sizE);
            Collections.sort(newlist);
            Collections.reverse(newlist);

            for (String str: newlist) {
                System.out.println(str);
            }
            System.out.println("********************************");

            for (String reverse: newlist){
                System.out.println(reverse);
            }

        }
    }

