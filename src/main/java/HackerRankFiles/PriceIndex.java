package HackerRankFiles;

import java.util.*;

public class PriceIndex {
    public static void main(String[] args) {
        //Halil Erdogan, SDET
        //HackerRank question solution

        //Enter number of virtual machines
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Virtual Machines = ");
        int numberOfVM = sc.nextInt();

        System.out.println("numberOfVM ="+numberOfVM);

        if (numberOfVM>=0 && numberOfVM<25) {
            System.out.println("Price for VM is = 5");

        } else {
            System.out.println("Enter another VM amount");
            }
        if (numberOfVM>=25 && numberOfVM<50) {
            System.out.println("Price for VM is = 4");
        }
        if (numberOfVM>=50 && numberOfVM<75) {
            System.out.println("Price for VM is = 3.5");
        }
        if (numberOfVM>=75 && numberOfVM<100) {
            System.out.println("Price for VM is = 3");
        }
        if (numberOfVM>=100 && numberOfVM<150) {
            System.out.println("Price for VM is = 2");
        }
        }
    }

