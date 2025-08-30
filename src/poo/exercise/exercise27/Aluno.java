package poo.exercise.exercise27;

import java.util.Date;

public class Aluno extends Pessoa{
    private String room;

    public Aluno(String name, Date dateOfBirth, String room) {
        super(name, dateOfBirth);
        this.room = room;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Aluno.super.toString());
        sb.append("Classe: ").append(room);
        return sb.toString();
    }
}
