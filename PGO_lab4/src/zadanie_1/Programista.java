package zadanie_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programista extends Pracownik {


    private String []  listaJezykowProgramowania;



    Programista(int id, String imie, String nazwisko, String [] listaJezykowProgramowania) {
        super(id, imie, nazwisko);
        this.listaJezykowProgramowania=listaJezykowProgramowania;

    }

    public List<String> getListaJezykowProgramowania() {
       return Arrays.asList(listaJezykowProgramowania);


    }

    @Override
    public String toString() {
        return  "Programista: "+"id"+ getId() +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\''+
                ", lista języków programowania: " + getListaJezykowProgramowania()
                ;
    }
}
