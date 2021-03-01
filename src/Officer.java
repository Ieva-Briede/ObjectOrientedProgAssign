import java.util.Stack;

public class Officer {

    String name;
    String surname;
    int officerID;
    String workingDistrict;
    int crimedSolved;

    public Officer(){

    }

    public Officer(String name, String surname, int officerID, String workingDistrict, int crimedSolved){
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.workingDistrict = workingDistrict;
        this.crimedSolved = crimedSolved;


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
        return crimedSolved;
    }

    public void setCrimedSolved(int crimedSolved) {
        this.crimedSolved = crimedSolved;
    }

    @Override
    public String toString() {
        return "Officer " +
                "name = " + name +
                ", surname = " + surname +
                ", officerID = " + officerID +
                ", workingDistrict = " + workingDistrict +
                ", crimedSolved = " + crimedSolved;
    }

    public int calculateLevel(int crimedSolved){
        int level = 0;
        switch (level){
            case 1:
                if (crimedSolved<20 || crimedSolved>=0);
                break;
            case 2:
                if (crimedSolved>=20 || crimedSolved<40);
                break;
            case 3:
                if (crimedSolved>=40);
                break;
            default:
                return -1;
        } return level;

    }

}
