public class PiggybankService {
    Piggybank bank;
    // this object is null until we instantiate it
    /*
     * No args constructor for the service class that will instantiate a new service, 
     * but also instantiate the piggybank with it
     */

    public PiggybankService (){
        bank = new Piggybank();
    }

    /**
     * If a piggy bank already exists, we can use it
     * @param bank an already instantiated piggy bank
     */
    public PiggybankService(Piggybank bank){
        this.bank = bank;
    }
    /*
     * If the bank has not been broken yet, starting from the bank's starting balance, 
     * add a quarter, and then update the piggybank object's balance
     */

    public void depositQuarter(){
        if (bank.broken == false) {
            double oldAmount = bank.amount;
            double newAmount = oldAmount + .25;
            bank.amount = newAmount;
        }
    }
    /*
     * Set bank broken to true and return the dollar amount it contained
     */
    public double breakPiggybankAndReturnBalance(){
        bank.broken = true;
        return bank.amount;
    }
}
