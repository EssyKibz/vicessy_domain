package Domain;

public class Transactions extends LostBooks {
    private int Amount;
    private int Transaction;
    private String Type;

    public Transactions(int ID,int ISBN,int Price,int UserID,int Amount ,int Transaction,String Type){
        super( ID, ISBN, Price, UserID);
        this.Amount = Amount;
        this.Transaction = Transaction;
        this.Type =Type;
    }


}
