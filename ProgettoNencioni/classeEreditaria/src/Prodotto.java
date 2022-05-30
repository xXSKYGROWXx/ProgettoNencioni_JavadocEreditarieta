/**
 * La classe gestisce prodotti di un negozio
 */
public class Prodotto {
    /**
     * Nome del prodotto
     */
    protected String nome;
    /**
     * Prezzo di vendita del prodotto
     */
    protected String provenienza;
    /**
     * Nazione di produzione del prodotto
     */
    protected double prezzo;

    /**
     * Costruttore parametrico, costruisce un oggetto Prodotto dato il nome prezzo e nazione di provenienza
     * @param nome
     * @param provenienza
     * @param prezzo
     */
    public Prodotto(String nome, String provenienza, double prezzo) {
        this.nome = nome;
        this.provenienza = provenienza;
        this.prezzo = prezzo;
    }

    /**
     * Applica uno sconto del 10% sul prezzo del prodotto
     */
    public void applicaSconto(){
        prezzo = prezzo - ((prezzo*10)/100);
    }

    /**
     * Restituisce il nome del prodotto
     * @return
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Imposta il nome del prodotto
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce la nazione di produzione del prodotto
     * @return
     */
    public String getProvenienza() {
        return this.provenienza;
    }

    /**
     * Imposta la nazione di provenienza del Prodotto
     * @param provenienza
     */
    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    /**
     * Restituisce il prezzo del prodotto
     * @return
     */
    public double getPrezzo() {
        return this.prezzo;
    }

    /**
     * Imposta il prezzo del Prodotto
     * @param prezzo
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto
     */
    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", provenienza='" + getProvenienza() + "'" +
            ", prezzo='" + getPrezzo() + "'" +
            "}";
    }
}
