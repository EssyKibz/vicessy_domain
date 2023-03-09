package Domain;

public class BorrowRequest {
    public String BookISBN;
    public int ID;
    public String Status;
    public int UserID;
    public BorrowRequest(String BookISBN,int ID,String Status,int UserID){
        this.BookISBN=BookISBN;
        this.ID=ID;
        this.Status=Status;
        this.UserID=UserID;

    }
    public String getBookISBN(){
        return BookISBN;
    }
    public String getStatus(){
        return Status;
    }
    public int getUserID(){
        return UserID;
    }
    public int getID(){
        return ID;
    }

    }

