import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Officer officer1 = new Officer("Bruce", "Lee", 52, "District Calm", 5);
        Officer officer2 = new Officer("James", "Bond", 7, "District Crazy Crimes", 127);
        Officer officer3 = new Officer("John", "Strange", 340, "District Normal", 34);

        System.out.println(officer1.toString());
        System.out.println(officer2.toString());
        System.out.println(officer3.toString());


        ArrayList<Officer> district99 = new ArrayList<Officer>();
        district99.add(officer1);
        district99.add(officer2);
        district99.add(officer3);
        //Collections.addAll(district99, officer1, officer2, officer3);
        System.out.println("Array List: " + district99);

        int countOfFirstLevel = 0;
        int cuntOfMoreThanFirstLevel = 0;
        int countOfJohn = 0;

        for (Officer officer : district99) {
            if (officer.calculateLevel() == 1) {
                countOfFirstLevel++;
            }
            if (officer.calculateLevel() > 1) {
                cuntOfMoreThanFirstLevel++;
            }
            if (officer.getName().equals("John")) {
                countOfJohn++;
            }

        }
        System.out.println("There are " + countOfFirstLevel + " officer(s) with level 1");
        System.out.println("There are " + cuntOfMoreThanFirstLevel + " officers who has higher level than 1");
        if (countOfJohn > 0) {
            System.out.println("There are " + countOfJohn + " officer(s) with name John");
        } else {
            System.out.println("There are not officers with name John");
        }
        Officer officer4= new Officer();
        System.out.println(officer4.newOfficer());


        district99.add(officer4);
        System.out.println("All officers: " + district99);


    }
}
