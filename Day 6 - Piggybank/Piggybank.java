public class Piggybank {
    public double amount;
    public boolean broken;

    public Piggybank(){
        this.amount = 0;
        this.broken = false;
    }

    public Piggybank(double startingBalance){
        this.amount = startingBalance;
        this.broken = false;
    }
}
