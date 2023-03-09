package Domain;

public class Feedback {
    private String Feedback;
    private String FeedBackdate;
    public Feedback(String Feedback,String FeedBackdate){
        this.Feedback=Feedback;
        this.FeedBackdate=FeedBackdate;
    }
    public String getFeedback(){
        return Feedback;
    }
    public String getFeedBackdate(){
        return FeedBackdate;
    }
}
