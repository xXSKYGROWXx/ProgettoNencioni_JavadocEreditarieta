import java.util.Calendar;

/**
 * La classe gestisce la tipologia Alimentare di Prodotto
 */
public class Alimentare extends Prodotto{
    /**
     * anno di scadenza riportato del prodotto
     */
    protected int annoScadenza;
    /**
     * mese di scadenza del prodotto
     */
    protected int meseScadenza;

    /**
     * Costruttore Parametrico - Costruisce un oggetto di tipo ProdottoAlimentare
     * @param nome
     * @param provenienza
     * @param prezzo
     * @param annoScadenza
     * @param meseScadenza
     */
    public Alimentare(String nome, String provenienza, double prezzo, int annoScadenza, int meseScadenza) {
        super(nome, provenienza, prezzo);
        if(annoScadenza > 1900 || meseScadenza >= 1 && meseScadenza <= 12){
        this.annoScadenza = annoScadenza;
        this.meseScadenza = meseScadenza;
        }
        else{
            System.out.println("anno o mese non validi");
        }
    }

    /**
     * Controlla la scadenza del prodotto
     * @return
     */
    public boolean isScaduto() {
        Calendar calendar = Calendar.getInstance();
        int anno = calendar.get(Calendar.YEAR);
        int mese = calendar.get(Calendar.MONTH);

        if(annoScadenza < anno || annoScadenza == anno && meseScadenza < mese){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Applica uno sconto sul prezzo del prodotto Alimentare.
     */
    public void applicaSconto() {
        Calendar calendar = Calendar.getInstance();
        int anno = calendar.get(Calendar.YEAR);
        int mese = calendar.get(Calendar.MONTH);

        if(isScaduto()) {
            
        }
        else{
            if(annoScadenza == anno && meseScadenza-1 == mese){
                prezzo = prezzo - ((prezzo*50)/100);
            }
            else{
                prezzo = prezzo - ((prezzo*10)/100);
            }
        }
    }

    /**
     * Restituisce l'anno di scadenza
     * @return
     */
    public int getAnnoScadenza() {
        return this.annoScadenza;
    }

    /**
     * Imposta l'anno di scadenza di Prodotto Alimentare
     * @param annoScadenza
     */
    public void setAnnoScadenza(int annoScadenza) {
        this.annoScadenza = annoScadenza;
    }

    /**
     * Restituisce il mese di scadenza
     * @return
     */
    public int getMeseScadenza() {
        return this.meseScadenza;
    }

    /**
     * Imposta il mese di scadenza di Prodotto Alimentare
     * @param meseScadenza
     */
    public void setMeseScadenza(int meseScadenza) {
        this.meseScadenza = meseScadenza;
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto ProdottoAlimentare
     */
    @Override
    public String toString() {
        return "{" +
            " annoScadenza='" + getAnnoScadenza() + "'" +
            ", meseScadenza='" + getMeseScadenza() + "'" +
            "}";
    }

}