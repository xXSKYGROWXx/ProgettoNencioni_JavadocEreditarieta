/**
 * La classe gestisce la tipologia NonAlimentare di Prodotto
 */
public class NonAlimentare extends Prodotto {
    /**
     * Materiale principale di cui è fatto il prodotto
     */
    protected String materialePrincipale;
    /**
     * Mostra se il prodotto è riciclabile o no
     */
    protected boolean riclabile;


    /**
     * Costruttore Parametrico - Costruisce un oggetto di tipo Prodotto NonAlimentare
     * @param nome
     * @param provenienza
     * @param prezzo
     * @param materialePrincipale
     * @param riclabile
     */
    public NonAlimentare(String nome, String provenienza, double prezzo, String materialePrincipale, boolean riclabile) {
        super(nome, provenienza, prezzo);
        this.materialePrincipale = materialePrincipale;
        this.riclabile = riclabile;
    }

    /**
     * Applica uno sconto sul prodotto Non Alimentare.
     */
    public void applicaSconto() {
        if(riclabile){
            prezzo = prezzo - ((prezzo*15)/100);
        }
        else{
            prezzo = prezzo - ((prezzo*10)/100);
        }
    }

    /**
     * Restituisce il nome del materiale principale
     * @return
     */
    public String getMaterialePrincipale() {
        return this.materialePrincipale;
    }

    /**
     * Imposta il materiale dell'oggetto
     * @param materialePrincipale
     */
    public void setMaterialePrincipale(String materialePrincipale) {
        this.materialePrincipale = materialePrincipale;
    }

    /**
     * Restituisce se il prodotto Non Alimnetare è riciclabile oppure no
     * @return
     */
    public boolean isRiclabile() {
        return this.riclabile;
    }

    /**
     * Imposta vero se l'oggetto è riciclabile
     * @param riclabile
     */
    public void setRiclabile(boolean riclabile) {
        this.riclabile = riclabile;
    }
     
    /**
     * Restituisce una stringa che rappresenta l'oggetto
     */
    @Override
    public String toString() {
        return "{" +
            " materialePrincipale='" + getMaterialePrincipale() + "'" +
            ", riclabile='" + isRiclabile() + "'" +
            "}";
    }
}
