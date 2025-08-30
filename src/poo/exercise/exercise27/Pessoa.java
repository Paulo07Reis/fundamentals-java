package poo.exercise.exercise27;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
    private String name;
    private Date dateOfBirth;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Pessoa(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(name).append(" ");
        sb.append("Data de nascimento: ").append(sdf.format(dateOfBirth)).append(" ");
        return sb.toString();
    }
}
