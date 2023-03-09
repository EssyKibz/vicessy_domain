package Domain;

public class Appointment {
    private String appointmentDate;
    private int ID;
    private int LibrarianID;
    private String Status;
    private int UserID;
    public Appointment(String appointmentDate,int ID,int LibrarianId,String Status,int UserID){
        this.appointmentDate=appointmentDate;
        this.ID=ID;
        this.LibrarianID=LibrarianId;
        this.Status=Status;
        this.UserID=UserID;
    }
    public String getAppointmentDate(){
        return appointmentDate;
    }
    public int getID(){
        return ID;
    }
    private int getLibrarianID(){
        return LibrarianID;
    }
    private int getUserID(){
        return UserID;
    }
    private String getStatus(){
        return Status;
    }

}
