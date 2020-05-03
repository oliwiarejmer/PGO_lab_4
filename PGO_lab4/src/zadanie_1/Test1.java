package zadanie_1;


public class Test1 {

    public static void main(String [] args){
        Pracownik programista = new Programista(1,"Michał", "Michalski", new String[]{"Java","Ruby"});
        Pracownik administrator = new Administrator(2,"Kacper","Kacpersky", new String[]{"system1","system2","system3"} );


        System.out.println(programista);
        System.out.println(administrator);
    }
}
