package zadanie_4;

public class Test4 {
    public static void main(String [] args){
        Browser chrome = new Chrome();
        Browser firefox = new Firefox();
        Browser opera = new Opera();
        chrome.info();
        firefox.info();
        opera.info();
    }
}
