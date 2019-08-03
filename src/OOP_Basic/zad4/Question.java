package OOP_Basic.zad4;

public class Question {
    User user;
    int date;

    public Question() {

    }

    public Question createQuestion(User user, int date) {
        return new Question(user, date);
    }

    private Question(User user, int date) {
        this.date = date;
        this.user = user;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Question{" +
                "user=" + user +
                ", date=" + date +
                '}';
    }
}
