package private_acces;

import javafx.beans.binding.IntegerBinding;

public class student {
    private String name;
    private String group;
    Integer nota;


    public String getname () {
        return this.name;
    }

    public void setName (String name ) {
        this.name = name;

    }




    public void setGroup(String group){
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setNota(Integer nota ) {
        this.nota = nota;
    }

    public Integer getNota() {
        return nota;
    }
}


