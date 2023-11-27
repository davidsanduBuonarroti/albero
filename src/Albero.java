public class Albero {

    private Albero figlio1 = null;
    private Albero figlio2;
    private int valore;
    //stampa
    //max nodi
    public Albero( Albero figlio1, Albero figlio2, int valore){
        this.figlio1= figlio1;
        this.figlio2 = figlio2;
        this.valore = valore;
    }
    public Albero(int valore){
        this.valore = valore;
    }

    public Object clone(){
        return new Albero(this.figlio1, this.figlio2, this.valore);
    }


    public boolean isLeaf(){
        return this.figlio1 == null && this.figlio2 == null;
    }

    public int getValore(){
        return this.valore;
    }


    public Albero getFiglio1(){
        return (Albero)this.figlio1;
    }

    public Albero getFiglio2(){
        return (Albero)this.figlio2;
    }

    public void setValore(int valore){
        this.valore = valore;
    }

    public String toString() {
        return "Albero{" +
                "figlio1=" + figlio1 +
                ", figlio2=" + figlio2 +
                ", valore=" + valore +
                '}';
    }

    public String stampaAlbero(){
        return this.stampaAlbero(0);
    }

    public String stampaAlbero(int p){
        String rit = "";
        for(int i = 0; i < p; i++){
            rit += "\t";
        }
        rit += this.valore + "\n";
        if(!(this.figlio1 == null)){
            rit += this.figlio1.stampaAlbero(p+1);
        }
        if(!(this.figlio2 == null)){
            rit += this.figlio2.stampaAlbero(p+1);
        }
        return rit;
    }

    public int sommaAlbero(){
        return this.sommaAlbero(0);
    }

    public int sommaAlbero(int p){
        int rit = 0;
        rit += this.valore;
        if(!(this.figlio1 == null)){
            rit += this.figlio1.sommaAlbero(p+1);
        }
        if(!(this.figlio2 == null)){
            rit += this.figlio2.sommaAlbero(p+1);
        }
        return rit;
    }

    public int maxAlbero(){
        return this.maxAlbero(0);
    }

    public int maxAlbero(int p){
        if(this.isLeaf()){
            return this.valore;
        }else{
            return ((this.getFiglio1().maxAlbero() > this.getFiglio2().maxAlbero()) ? this.getFiglio1().maxAlbero() : this.getFiglio2().maxAlbero());
        }
    }
}