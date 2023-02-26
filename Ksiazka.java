public class Ksiazka {
    private  String tytul;
    private String autor;
    private int rokPpublikacji;

    public Ksiazka(String tytul, Autorzy autor, int rokPpublikacji) {
        this.tytul = tytul;

        this.rokPpublikacji=rokPpublikacji;

    }
    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getrokPpublikacji() {
        return rokPpublikacji;
    }
    @Override
    public String toString() {
        return "Ksiazka to: " +
                "tytul ='" + tytul + '\'' +
                ", autor=" + autor +
                ", a rok publikacjir= " + rokPpublikacji ;

    }


}
