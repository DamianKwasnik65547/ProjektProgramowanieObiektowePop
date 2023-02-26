public class Uzytkownik {
    private  String imieUzy;

    public Uzytkownik(String imieUzy) {
        this.imieUzy = imieUzy;
    }

    public String getImieUzy() {
        return imieUzy;
    }
    @Override
    public String toString() {
        return "Uzytkownik to : " +
                "imie= " + imieUzy + '\''
                ;
    }
}
