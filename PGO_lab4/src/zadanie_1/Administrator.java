package zadanie_1;

import java.util.Arrays;
import java.util.List;

public class Administrator extends Pracownik {


    private String[] listaSystemow;

    Administrator(int id, String imie, String nazwisko, String[] listaSystemow) {
        super(id, imie, nazwisko);
        this.listaSystemow = listaSystemow;
    }

    public List<String> getListaSystemow() {

        return Arrays.asList(listaSystemow);
    }

    @Override
    public String toString() {
        return  "Administrator: "+"id=" + getId() +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\''+
                ", lista systemów: " + getListaSystemow()
                ;
    }
    }

