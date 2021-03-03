import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Officer {

    String name;
    String surname;
    int officerID;
    String workingDistrict;
    int crimesSolved;

    public Officer() {

    }

    public Officer(String name, String surname, int officerID, String workingDistrict, int crimedSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.workingDistrict = workingDistrict;
        this.crimesSolved = crimedSolved;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public String getWorkingDistrict() {
        return workingDistrict;
    }

    public void setWorkingDistrict(String workingDistrict) {
        this.workingDistrict = workingDistrict;
    }

    public int getCrimedSolved() {
        return crimesSolved;
    }

    public void setCrimedSolved(int crimedSolved) {
        this.crimesSolved = crimedSolved;
    }

    @Override
    public String toString() {
        return "Officer " +
                "name = " + name +
                ", surname = " + surname +
                ", officerID = " + officerID +
                ", workingDistrict = " + workingDistrict +
                ", crimedSolved = " + crimesSolved;
    }

    public int calculateLevel() {
        if (crimesSolved < 0) {
            return -1;
        }
        if (crimesSolved < 20) {
            return 1;
        }
        if (crimesSolved < 40) {
            return 2;
        }
        if (crimesSolved >= 40) {
            return 3;

        }
        return -1;
    }

    public static Officer newOfficer() {
            Scanner input = new Scanner(System.in);
            System.out.println("Officer' s name: ");
            String name = input.nextLine();
            System.out.println("Officers' surname: ");
            String surname = input.nextLine();
            System.out.println("Officers' ID number: ");
            int officerID = input.nextInt();
            System.out.println("Officer' s working district: ");
            input.nextLine();
            String workingDistrict = input.nextLine();
            System.out.println("Crimes solved: ");
            int crimesSolved = input.nextInt();
            return new Officer(name, surname, officerID, workingDistrict, crimesSolved);

        }

    }

