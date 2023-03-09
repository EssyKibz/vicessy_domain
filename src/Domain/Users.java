package Domain;

import java.util.ArrayList;

public class Users {
    public String FName;
    public String LName;
    public int CellPhoneNo;
    public int NoOfBooksBorrowed;
    public int AdmissionNo;
    public int NoOfBooksLost;
    public int priceOfBooksLost;
    public ArrayList<Book> borrowedBooks;

    public String Type;;
    public Users(String FName, String LName, int CellPhoneNo, int NoOfBooksBorrowed, int AdmissionNo, int NoOfBooksLost, int priceOfBooksLost, String Type) {
        this.FName = FName;
        this.LName = LName;
        this.CellPhoneNo = CellPhoneNo;
        this.AdmissionNo = AdmissionNo;
        this.NoOfBooksBorrowed = NoOfBooksBorrowed;
        this.priceOfBooksLost = priceOfBooksLost;
        this.Type = Type;
        this.NoOfBooksLost = NoOfBooksLost;
        borrowedBooks = new ArrayList<Book>();
    }
    public String getFName(){
        return FName;
    }
    public String getLName(){
        return LName;
    }
public int getCellPhoneNo(){
        return CellPhoneNo;
}
public int getAdmissionNo(){
        return AdmissionNo;
}
public int getNoOfBooksBorrowed(){
        return NoOfBooksBorrowed;
}
public int getNoOfBooksLost(){
        return NoOfBooksLost;
}
public int getPriceOfBooksLost(){
        return priceOfBooksLost;
}
public String getType(){
        return Type;
}

    }

