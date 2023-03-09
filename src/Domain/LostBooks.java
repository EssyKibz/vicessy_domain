package Domain;

public class LostBooks {
    public int ID;
    public int ISBN;
    public int Price;
    public int UserID;
    public LostBooks(int ID,int ISBN,int Price,int UserID){
        this.ID=ID;
        this.ISBN=ISBN;
        this.Price=Price;
        this.UserID=UserID;
    }
    public int getID(){
        return ID;
    }

    public int getISBN(){
        return ISBN;
    }

    public int getUserID(){

        return UserID;
    }

    public int getPrice(){
        return Price;
    }
}

