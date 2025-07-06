package poo.exercise.exercise04.domain;

public class Student {
    private String name;
    private double firstNote;
    private double secondNote;
    private double thirdNote;

    public void hasApproved(){
        double totalPoints = firstNote + secondNote + thirdNote;
        if(totalPoints >= 60){
            System.out.printf("""
                    Final grade = %.2f
                    Pass
                    """, totalPoints
            );
        } else {
            System.out.printf("""
                    Final grade = %.2f
                    Failed
                    Missing %.2f Points
                    """, totalPoints, (60 - totalPoints));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstNote() {
        return firstNote;
    }

    public void setFirstNote(double firstNote) {
        this.firstNote = firstNote;
    }

    public double getSecondNote() {
        return secondNote;
    }

    public void setSecondNote(double secondNote) {
        this.secondNote = secondNote;
    }

    public double getThirdNote() {
        return thirdNote;
    }

    public void setThirdNote(double thirdNote) {
        this.thirdNote = thirdNote;
    }
}
