package Domain;

public class Book {
    private String Author;
    private int Edition;
    private int ISBN;
    private  String Name;
    private String Type;
    public Book(String Author,int Edition,int ISBN,String Name,String Type){
        this.Author=Author;
        this.Edition=Edition;
        this.Name=Name;
        this.ISBN=ISBN;
        this.Type=Type;
    }
    public String getAuthor(){
        return Author;
    }
    public int getEdition(){
        return Edition;
    }
    public int getISBN(){
        return ISBN;
    }
    public String getName(){
        return Name;
    }
    public String getType(){
        return Type;
    }
public void showDetails(){
        System.out.println(ISBN+Name+Author+Type+Edition);
}
}
