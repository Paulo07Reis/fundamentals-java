package poo.exercise.exercise27;

import java.util.Date;

public class Professor extends Pessoa {
    private String subject;

    public Professor(String name, Date dateOfBirth, String subject) {
        super(name, dateOfBirth);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Professor.super.toString());
        sb.append("Materia: ").append(subject);
        return sb.toString();
    }
}
