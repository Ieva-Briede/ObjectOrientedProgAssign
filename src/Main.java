import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Officer officer1 = new Officer("Bruce", "Lee", 52, "District Calm", 5);
        Officer officer2 = new Officer("James", "Bond", 7, "District Crazy Crimes", 127);
        Officer officer3 = new Officer("John", "Strange", 340, "District Normal", 34);

        System.out.println(officer1);
        System.out.println(officer2);
        System.out.println(officer3);

        Officer[] district99 = {officer1, officer2, officer3};
        System.out.println(Arrays.deepToString(district99));


        ArrayList<Officer> district999 = new ArrayList<Officer>();
        Collections.addAll(district999, district99);
        System.out.println("Converted Array List: " + district999);

        int countOfFirstLevel = 0;
        int cuntOfMoreThanFirstLevel = 0;
        int countOfJohn = 0;

        for (Officer officer: district99){
            if (officer.calculateLevel(officer.crimedSolved)==1){
                countOfFirstLevel++;
            }
            System.out.println(countOfFirstLevel);
        }




    }
}
