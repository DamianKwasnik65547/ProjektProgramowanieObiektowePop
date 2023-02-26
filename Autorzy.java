public class Autorzy {
    private  String imieA;

    public Autorzy(String imieA) {
        this.imieA = imieA;
    }

    public String getImieA() {
        return imieA;
    }
    @Override
    public String toString() {
        return "Autor to " +
                "imie ='" + imieA + '\'' ;
    }
}
