public class Card {
    public Suits suits;
    public Ranks ranks;

    public Card( Ranks ranks,Suits suits){
        this.suits=suits;
        this.ranks=ranks;

    }

    public Card(){

    }


    public Suits getSuits() {
        return suits;
    }

    public void setSuits(Suits suits) {
        this.suits = suits;
    }

    public Ranks getRanks() {
        return ranks;
    }

    public void setRanks(Ranks ranks) {
        this.ranks = ranks;
    }

    public String getDescription(){
        return ranks + " - " + suits;
    }


}
