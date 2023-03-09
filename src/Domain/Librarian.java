package Domain;

public class Librarian {
    private int Admin;
    private String FName;
    private int ID;
    private String LibrarianPassword;
    private String LName;
    private String UserName;
    public Librarian(int Admin,String FName,int ID, String LibrarianPassword,String LName,String UserName){
        this.Admin=Admin;
        this.FName=FName;
        this.ID=ID;
        this.LibrarianPassword=LibrarianPassword;
        this.LName=LName;
        this.UserName=UserName;

    }
    public String getFName(){
        return FName;
    }
    public String getLName(){
        return LName;
    }
    public String getLibrarianPassword(){
        return LibrarianPassword;
    }
    public String getUserName(){
        return UserName;
    }
    public int getID(){
        return ID;
    }
    public int getAdmin(){
        return Admin;
    }
    }


