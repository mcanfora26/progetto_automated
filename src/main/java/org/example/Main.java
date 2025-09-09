package org.example;

/**
 * Classe principale del progetto.
 */
public final class Main {

    /**
     * Costruttore privato per evitare istanziazione.
     */
    private Main() {
        throw new UnsupportedOperationException("Classe di utilità");
    }

    /**
     * Metodo principale.
     * @param args argomenti da riga di comando
     */
    public static void main(final String[] args) {
        final int maxTentativi = 5;
        System.out.println("Tentativi massimi: " + maxTentativi);
    }
}
